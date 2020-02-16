package com.heav.photographic.manage.Action;

import java.util.Date;

import javax.annotation.Resource;

import com.heav.photographic.core.common.exception.ParamValideException;
import com.heav.photographic.core.common.exception.ServiceException;
import com.heav.photographic.core.common.util.StringUtil;
import com.heav.photographic.core.domain.UserInfo;
import com.heav.photographic.core.service.UserInfoService;

import tool.util.BeanUtil;

public class UserInfoAction {
	
	private static UserInfoService userinfosv=(UserInfoService) BeanUtil.getBean("userInfoService");
	public static boolean createUser(String username,String phone,String password) {
		UserInfo user=new UserInfo();
		user.setUsername(username);
		user.setMobileNumber(phone);
		user.setPassword(password);
		user.setRegisterTime(new Date());
		user.setState(0);
		int n=userinfosv.insert(user);
		return n==1?true:false;
	}
	public static void checkParam(String username,String password,String phone) throws ParamValideException, ServiceException {
		checkUsername(username);
		checkPhone(phone);
		checkPassword(password);
	}
	public static void checkUsername(String username) throws ParamValideException, ServiceException {
		if(StringUtil.isBlank(username)) {
			throw new ParamValideException("用户名不能为空");
		}
		if(userinfosv.countUserByUserName(username)>0) {
			throw new ParamValideException("用户名已存在");
		}
	}
	
	public static void checkPassword(String password) throws ParamValideException {
		if(StringUtil.isBlank(password)) {
			throw new ParamValideException("密码不能为空");
		}
	}
	
	public static void checkPhone(String phone) throws ParamValideException, ServiceException {
		if(StringUtil.isBlank(phone)) {
			throw new ParamValideException("手机号不能为空");
		}
		if(!StringUtil.isPhone(phone)) {
			throw new ParamValideException("手机号码格式不正确");
		}
		if(userinfosv.countUserByPhone(phone)>0) {
			throw new ParamValideException("手机号码已存在");
		}
	}
	
	
}
