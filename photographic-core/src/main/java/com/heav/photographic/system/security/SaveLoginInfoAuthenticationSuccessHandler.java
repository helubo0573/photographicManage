package com.heav.photographic.system.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

import com.heav.photographic.core.common.constant.Constant;
import com.heav.photographic.core.common.exception.ServiceException;
import com.heav.photographic.core.common.util.ServletUtils;
import com.heav.photographic.core.domain.SysRole;
import com.heav.photographic.core.domain.UserInfo;
import com.heav.photographic.core.service.SysRoleService;
import com.heav.photographic.core.service.UserInfoService;
import com.heav.photographic.core.system.constant.SystemConstant;

@Service
public class SaveLoginInfoAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler
{

	public static final Logger logger = LoggerFactory.getLogger(SaveLoginInfoAuthenticationSuccessHandler.class);

	@Autowired
	private SysRoleService sysroleService;

	@Autowired
	private UserInfoService userService;

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException
	{
		try{
			// 设置用户登录信息
			UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			UserInfo op = new UserInfo();
			op.setUsername(user.getUsername());
			//op.setLoginIp(getIpAddr(request));
			// 更新用户登录信息
			userService.editUserLoginInfo(op);
			Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
			UserInfo sysUser = userService.getUserByUserName(op.getUsername());
			HttpSession session = request.getSession();
			session.setAttribute("SysUser", sysUser);
			if (roles.contains(SystemConstant.ROLE_DEFAULT) && sysUser.getState().intValue() == 0){// 状态为0的可以登录
				Map<Object, Object> context = new HashMap<Object, Object>();
				context.put(Constant.RESPONSE_CODE, Constant.SUCCEED_CODE_VALUE);
				context.put(Constant.RESPONSE_CODE_MSG, "登录成功");
				ServletUtils.writeToResponse(response, context);
				List<SysRole> roleList = sysroleService.getRoleListByUserId(op.getId());
				List<Long> roleIdList = new ArrayList<Long>();
				// 转换用户的角色为用户授权, 并记录用户角色Id列表
				for (SysRole role : roleList){
					roleIdList.add(role.getId());
				}
				session.setAttribute("roleList", roleIdList);
				super.onAuthenticationSuccess(request, response, authentication);
			} else{ // 登录失败
				Map<Object, Object> context = new HashMap<Object, Object>();
				context.put(Constant.RESPONSE_CODE, Constant.FAIL_CODE_VALUE);
				context.put(Constant.RESPONSE_CODE_MSG, sysUser.getState().intValue() == 1 ? "该账号已被锁定，请解锁后使用！" : "登录失败！");
				ServletUtils.writeToResponse(response, context);
			}
		} catch (ServiceException e){
			logger.error(e.toString(), e);
		}
	}

	private String getIpAddr(HttpServletRequest request)
	{
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
		{
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
		{
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
		{
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	public void setSysUserService(UserInfoService sysUserService)
	{
		this.userService = sysUserService;
	}

}
