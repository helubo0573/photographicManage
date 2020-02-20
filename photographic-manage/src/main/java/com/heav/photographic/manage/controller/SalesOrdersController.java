package com.heav.photographic.manage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.heav.photographic.core.common.constant.PathConstant;

@Scope("prototype")
@Controller
public class SalesOrdersController {

	@RequestMapping(value="/salesorders/orderInfo")
	public String toOrderInfo(HttpServletRequest request,HttpServletResponse response) {
	
		return PathConstant.OrderInfo;
	}
}
