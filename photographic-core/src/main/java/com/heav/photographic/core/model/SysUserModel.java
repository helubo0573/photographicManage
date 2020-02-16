package com.heav.photographic.core.model;

import org.springframework.beans.BeanUtils;

import com.heav.photographic.core.common.exception.OperatorException;
import com.heav.photographic.core.common.util.MD5;
import com.heav.photographic.core.common.util.ValidateUtil;
import com.heav.photographic.core.domain.UserInfo;

import tool.util.StringUtil;


public class SysUserModel extends UserInfo
{

	private static final long serialVersionUID = -6789313850889066219L;

	private String oldPassword;

	private String confirmPassword;

	public static SysUserModel instance(UserInfo sysUser)
	{
		SysUserModel userModel = new SysUserModel();
		BeanUtils.copyProperties(sysUser, userModel);
		return userModel;
	}

	public UserInfo prototype()
	{
		UserInfo user = new UserInfo();
		BeanUtils.copyProperties(this, user);
		return user;
	}

	public int validLoginModel()
	{
		if (StringUtil.isBlank(getUsername()))
		{
			throw new OperatorException("用户名不能为空！", 1);
		}
		if (StringUtil.isBlank(getPassword()))
		{
			throw new OperatorException("密码不能为空！", 1);
		}
		return -1;
	}

	public String validModifyPwdModel(UserInfo user)
	{
		if (getOldPassword() == null)
		{
			throw new OperatorException("请输入您的原密码！", 1);
		} else if (!MD5.encode(getOldPassword()).equals(user.getPassword()))
		{
			throw new OperatorException("原密码错误！", 1);
		} else if (getPassword().equals(getOldPassword()))
		{
			throw new OperatorException("新密码不能和原密码相同！", 1);
		} else if (!getPassword().equals(getConfirmPassword()))
		{
			throw new OperatorException("新密码和确认密码不相同！", 1);
		}
		return "";
	}

	public int validRegModel()
	{
		if (!ValidateUtil.isUser_name(getUsername()))
		{
			throw new OperatorException("用户名格式错误！", 1);
		}
		if (StringUtil.isBlank(getPassword()))
		{
			throw new OperatorException("密码不能为空！", 1);
		}
		if (StringUtil.isBlank(getConfirmPassword()))
		{
			throw new OperatorException("确认密码不能为空！");
		}
		if (!getPassword().equals(getConfirmPassword()))
		{
			throw new OperatorException("两次输入的密码不一致！");
		}
		return -1;
	}

	public int validOfficeModel()
	{

		return -1;
	}

	public String getOldPassword()
	{
		return oldPassword;
	}

	public void setOldPassword(String oldPassword)
	{
		this.oldPassword = oldPassword;
	}

	public String getConfirmPassword()
	{
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword)
	{
		this.confirmPassword = confirmPassword;
	}
}
