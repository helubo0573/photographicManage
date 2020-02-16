package com.heav.photographic.core.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.heav.photographic.core.common.exception.ParamValideException;
import com.heav.photographic.core.common.mapper.BaseMapper;
import com.heav.photographic.core.common.service.impl.BaseServiceImpl;
import com.heav.photographic.core.mapper.SysSmsSendMapper;
import com.heav.photographic.core.domain.SysSmsSend;
import com.heav.photographic.core.service.SysSmsSendService;


/**
 * 验证短信发送功能ServiceImpl
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-06-11 11:16:32
 */
 
@Service("sysSmsSendService")
public class SysSmsSendServiceImpl extends BaseServiceImpl<SysSmsSend, Long> implements SysSmsSendService {
	
    private static final Logger logger = LoggerFactory.getLogger(SysSmsSendServiceImpl.class);
   
    @Resource
    private SysSmsSendMapper sysSmsSendMapper;

	@Override
	public BaseMapper<SysSmsSend, Long> getMapper() {
		return sysSmsSendMapper;
	}

	@SuppressWarnings("unused")
	@Override
	public void checkSms(String phone, String code) throws ParamValideException {
		if(false){
			throw new ParamValideException("验证码不正确");
		}
	}

	@Override
	public boolean sendsms(String phone, String code) {
		// TODO Auto-generated method stub
		
		return true;
	}
	
}