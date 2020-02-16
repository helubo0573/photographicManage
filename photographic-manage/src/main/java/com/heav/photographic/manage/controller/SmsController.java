package com.heav.photographic.manage.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.heav.photographic.core.service.SysSmsSendService;

public class SmsController {

	@Resource
	private SysSmsSendService syssmsservice;
	
	@RequestMapping(value="")
	public void sendSms(HttpServletResponse response, HttpServletRequest request,
			@RequestParam(value="phone",required=true)String phone) {
		
	}
}
