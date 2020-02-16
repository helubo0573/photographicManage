package com.heav.photographic.system.realm;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

import com.heav.photographic.core.common.exception.ServiceException;
import com.heav.photographic.core.domain.SysPerm;
import com.heav.photographic.core.domain.UserInfo;
import com.heav.photographic.core.service.SysPermService;
import com.heav.photographic.core.service.UserInfoService;

public class ShiroRealm extends AuthorizingRealm
{

	private static final Logger logger = Logger.getLogger(ShiroRealm.class);

	@Resource
	private UserInfoService sysUserService;
	@Resource
	private SysPermService sysPermService;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals)
	{
		// (关闭浏览器，或超时)非正常退出，即没有显式调用 SecurityUtils.getSubject().logout()
		if (!SecurityUtils.getSubject().isAuthenticated())
		{
			doClearCache(principals);
			SecurityUtils.getSubject().logout();
			return null;
		}
		logger.info("授权认证：" + principals.getRealmNames());
		String userName = (String) principals.getPrimaryPrincipal();
		List<SysPerm> perms = sysPermService.listByUserName(userName);

		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		for (SysPerm perm : perms)
		{
			// 基于Permission的权限信息
			info.addStringPermission(perm.getCode());
		}
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException
	{

		// 获取基于用户名和密码的令牌
		// user.login(token) 间接调用
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		// 从数据库中查询用户用信息
		UserInfo user;
		user = sysUserService.getUserByUserName(token.getUsername());

		if (user == null)
		{
			throw new UnknownAccountException();// 没找到帐号
		} else if (user.getState() != 0)
		{
			throw new LockedAccountException(); // 帐号锁定
		} else
		{
			Subject subject = SecurityUtils.getSubject();
			Session session = subject.getSession();
			session.setAttribute("SysUser", user);
			return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());
		}

	}

}
