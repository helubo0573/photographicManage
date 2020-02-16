package com.heav.photographic.core.service;

import java.util.Map;

import com.heav.photographic.core.common.exception.ParamValideException;
import com.heav.photographic.core.common.service.BaseService;
import com.heav.photographic.core.domain.SysSmsSend;

/**
 * 验证短信发送功能Service
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-06-11 11:16:32
 */
public interface SysSmsSendService extends BaseService<SysSmsSend, Long>{

	/**
	 * 验证手机号码验证
	 *	@param phone	手机号码
	 *	@param code		验证码
	 * @throws ParamValideException 
	 **/
	void checkSms(String phone,String code) throws ParamValideException;
	
	/**
	 * 发送验证码
	 * @param phone		手机号码
	 * @param code		验证码
	 * @return 
	 */
	boolean sendsms(String phone,String code);
}
