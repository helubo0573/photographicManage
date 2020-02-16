package com.heav.photographic.system.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import tool.util.StringUtil;

import com.heav.photographic.core.common.exception.ServiceException;
import com.heav.photographic.core.domain.SysRole;
import com.heav.photographic.core.domain.UserInfo;
import com.heav.photographic.core.model.MenuModel;
import com.heav.photographic.core.service.SysMenuService;
import com.heav.photographic.core.service.SysRoleService;
import com.heav.photographic.core.service.UserInfoService;
import com.heav.photographic.core.system.constant.SystemConstant;

@SuppressWarnings("deprecation")
@Service
public class UserRoleDetailProvider implements UserDetailsService
{

	public static final Logger logger = LoggerFactory.getLogger(UserRoleDetailProvider.class);

	@Autowired
	private UserInfoService sysUserService;

	@Autowired
	private SysRoleService sysRoleService;

	@Autowired
	private SysMenuService sysMenuService;

	private PasswordEncoder passwordEncoder;

	private String systemPasswordInitialization;

	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException, DataAccessException
	{
		UserInfo user = sysUserService.getUserByUserName(userName);	// 根据登陆用户名获得用户信息
		if (user == null)	throw new UsernameNotFoundException("用户名:"+userName + ",不存在!");
		Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();		// 用户授权集合
		Map<String, UserFunction> functionMap = new HashMap<String, UserFunction>();// 用户资源映射<资源名称, 资源属性集合>
		List<SysRole> roleList = sysRoleService.getRoleListByUserId(user.getId());	// 根据用户Id获得用户角色列表
		auths.add(new MGrantedAuthority(SystemConstant.ROLE_DEFAULT));			// 设置默认权限
		if (roleList != null && !roleList.isEmpty()){
			List<Long> roleIdList = new ArrayList<Long>();
			roleList.forEach(role->{
				auths.add(new MGrantedAuthority(role.getId().toString()));
				roleIdList.add(role.getId());
			});
			List<MenuModel> menuList = sysMenuService.getMenuListByRoleIds(roleIdList);		// 根据用户角色Id列表获得该角色拥有的系统功能列表
			if (menuList != null && !menuList.isEmpty()){
				menuList.forEach(menu->{	// 转换系统功能为用户资源
					String href = menu.getHref();
					if (StringUtil.isNotBlank(href)){
						String[] urls = StringUtils.commaDelimitedListToStringArray(href);
						for (String url : urls){
							url = StringUtil.trim(url);
							if (StringUtil.isNotBlank(url)){
								
								if (!functionMap.containsKey(url)){	// 设置用户资源映射, key为资源对应的名称 (即系统功能url), value为资源属性集合 (即拥有该系统功能的角色)
									UserFunction userFunction = new UserFunction(menu.getId());
									ConfigAttribute ca = new SecurityConfig(menu.getRoleIDtostr());
									userFunction.add(ca);
									functionMap.put(url, userFunction);
								} else{
									functionMap.get(url).add(new SecurityConfig(menu.getRoleIDtostr()));
								}
							}
						}
					}
				});
			}
		}
		return new UserRole(userName, user.getPassword(), auths,functionMap);
	}

	private String getPassword(UserInfo op) throws ServiceException
	{
		String password = op.getPassword();
		if (SystemConstant.SYSTEM_LOGIN_NAME.equals(op.getUsername()) && op.getLoginTime() == null)
		{
			if (StringUtil.isNotBlank(systemPasswordInitialization))
			{
				password = passwordEncoder.encodePassword(systemPasswordInitialization);
			} else
			{
				password = passwordEncoder.encodePassword(SystemConstant.SYSTEM_PASSWORD_DEFAULT);
			}
			op.setPassword(password);
			sysUserService.editUserPassWord(op);
		}
		return password;
	}

	public UserInfoService getSysUserService()
	{
		return sysUserService;
	}

	public void setSysUserService(UserInfoService sysUserService)
	{
		this.sysUserService = sysUserService;
	}

	public SysRoleService getSysRoleService()
	{
		return sysRoleService;
	}

	public void setSysRoleService(SysRoleService sysRoleService)
	{
		this.sysRoleService = sysRoleService;
	}

	public SysMenuService getSysMenuService()
	{
		return sysMenuService;
	}

	public void setSysMenuService(SysMenuService sysMenuService)
	{
		this.sysMenuService = sysMenuService;
	}

	public String getSystemPasswordInitialization()
	{
		return systemPasswordInitialization;
	}

	public void setSystemPasswordInitialization(String systemPasswordInitialization)
	{
		this.systemPasswordInitialization = systemPasswordInitialization;
	}

}
