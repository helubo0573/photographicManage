package com.heav.photographic.manage.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.heav.photographic.core.common.constant.Constant;
import com.heav.photographic.core.common.exception.ImgCodeException;
import com.heav.photographic.core.common.exception.ParamValideException;
import com.heav.photographic.core.common.exception.ServiceException;
import com.heav.photographic.core.common.util.ServletUtils;
import com.heav.photographic.core.common.web.controller.BaseController;
import com.heav.photographic.core.domain.SysMenu;
import com.heav.photographic.core.domain.UserInfo;
import com.heav.photographic.core.service.SysSmsSendService;
import com.heav.photographic.core.service.UserInfoService;
import com.heav.photographic.manage.Action.AuthAction;
import com.heav.photographic.manage.Action.UserInfoAction;
import com.heav.photographic.system.security.PasswordEncoder;

@Scope("prototype")
@Controller
public class UserController extends BaseController{
	
	@Resource
	private AuthenticationManager authenticationManager;
	@Resource
	private PasswordEncoder passwordEncoder;// 密码加密
	@Resource
	private SysSmsSendService smsservice;
	@Resource
	private UserInfoService userInfoService;
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	@RequestMapping(value="user/login")
	public void Login(HttpServletResponse response, HttpServletRequest request,HttpSession session,
			@RequestParam(value="username",required=true)String username,
			@RequestParam(value="password",required=true)String password,
			@RequestParam(value="checkcode",required=true)String checkcode){
		Map<String, Object> res = new HashMap<String, Object>();
		try {
			AuthAction.checkImgCode(checkcode, session.getAttribute("code"));
			
			Authentication authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
			Authentication authentication = authenticationManager.authenticate(authenticationToken);
			Subject user = SecurityUtils.getSubject();
			//获取加密后的密码字符串
			password = passwordEncoder.encodePassword(String.valueOf(password));
			System.out.println(username+"---"+password);
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			//token.setRememberMe(true);
			user.login(token);
			SecurityContextHolder.getContext().setAuthentication(authentication);
			//还需要研究这一条
			session.setAttribute("SPRING_SECURITY_CONTEXT", SecurityContextHolder.getContext());
			
			UserInfo userinfo=(UserInfo) user.getSession().getAttribute("SysUser");
			
			session.setAttribute("SysUser", userinfo);
			
			
			res.put(Constant.RESPONSE_CODE, Constant.SUCCEED_CODE_VALUE);
			res.put(Constant.RESPONSE_CODE_MSG, "登录成功");
		} catch (ImgCodeException e) {
			logger.error(e.getMessage(), e);
			res.put(Constant.RESPONSE_CODE, Constant.FAIL_CODE_VALUE);
			res.put(Constant.RESPONSE_CODE_MSG, "图片验证码错误");
		}catch (IncorrectCredentialsException ex)
		{
			logger.error("密码错误", ex);
			res.put(Constant.RESPONSE_CODE, Constant.OTHER_CODE_VALUE);
			res.put(Constant.RESPONSE_CODE_MSG, "密码错误请重新输入");
		} catch (LockedAccountException ex)
		{
			logger.error("该用户已锁定", ex);
			res.put(Constant.RESPONSE_CODE, Constant.OTHER_CODE_VALUE);
			res.put(Constant.RESPONSE_CODE_MSG, "该用户已锁定，请联系管理员！");
		} catch (AuthenticationException ex)
		{
			logger.error("登录失败", ex);
			res.put(Constant.RESPONSE_CODE, Constant.FAIL_CODE_VALUE);
			res.put(Constant.RESPONSE_CODE_MSG, "登录失败");
		} catch (ExpiredCredentialsException ex)
		{
			logger.error(ex.getMessage(), ex);
			res.put(Constant.RESPONSE_CODE, Constant.FAIL_CODE_VALUE);
			res.put(Constant.RESPONSE_CODE_MSG, ex.getMessage());
		} catch (UnknownAccountException ex)
		{
			logger.error(ex.getMessage(), ex);
			res.put(Constant.RESPONSE_CODE, Constant.FAIL_CODE_VALUE);
			res.put(Constant.RESPONSE_CODE_MSG, "账号不存在请核对后重新输入");
		}
		ServletUtils.writeToResponse(response, res);
	}
	
	@RequestMapping(value="user/register")
	public void Register(HttpServletResponse response, HttpServletRequest request,
			@RequestParam(value="username",required=true)String username,
			@RequestParam(value="password",required=true)String password,
			@RequestParam(value="phone",required=true)String phone,
			@RequestParam(value="checkmsg",required=true)String checkmsg) throws ServiceException {
		logger.info(username+"---"+password+"---"+phone+"----"+checkmsg);
		UserInfo user=userInfoService.getUserByUserName(username);
		System.out.println(user+"----"+username+"---"+password+"---"+phone+"----"+checkmsg);
		Map<String, Object> res = new HashMap<String, Object>();
		try {
			//smsservice.checkSms(phone, checkmsg);
			UserInfoAction.checkParam(username, password, phone);
			password=passwordEncoder.encodePassword(password);
			boolean flag=UserInfoAction.createUser(username, phone, password);
			System.out.println("flag:"+flag);
			if(flag) {
				res.put(Constant.RESPONSE_CODE, Constant.SUCCEED_CODE_VALUE);
				res.put(Constant.RESPONSE_CODE_MSG, "用户注册成功");
			}else {
				res.put(Constant.RESPONSE_CODE, Constant.FAIL_CODE_VALUE);
				res.put(Constant.RESPONSE_CODE_MSG, "创建用户失败");
			}
		} catch (ParamValideException e) {
			logger.error(e.getMessage(),e);
			res.put(Constant.RESPONSE_CODE, Constant.FAIL_CODE_VALUE);
			res.put(Constant.RESPONSE_CODE_MSG, e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		ServletUtils.writeToResponse(response, res);
	}
	@RequestMapping(value="user/getimgcode")
	public void getImgCode() throws Exception {
		super.generateImgCode();
	}
	@RequestMapping(value="user/loginout")
	public void outlogin() {
		
	}
	@RequestMapping(value="user/getmenu")
	public void getUserMenu(HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException, IOException {
		UserInfo user=(UserInfo) request.getSession().getAttribute("SysUser");
		System.out.println(user.getUsername());
		List<SysMenu> menu=userInfoService.getMenuByUserName(user.getUsername());
		request.setAttribute("usermenu", menu);
		ServletUtils.writeToResponse(response, menu);
	}
}
