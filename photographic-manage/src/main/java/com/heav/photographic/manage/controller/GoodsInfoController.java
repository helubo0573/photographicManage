package com.heav.photographic.manage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.heav.photographic.core.common.constant.PathConstant;

@Scope("prototype")
@Controller
public class GoodsInfoController {
	
	@RequestMapping(value="/goods/goodsinfo")
	public String toGoodsInfoManage(HttpServletRequest request,HttpServletResponse response) {
		
		return PathConstant.GoodsManage;
		
	}
	
	@RequestMapping(value="/goods/goodstype")
	public String GoodsTypeManage(HttpServletRequest request,HttpServletResponse response) {
		
		return PathConstant.GoodsType;
	}
	
	@RequestMapping(value="/goods/goodssize")
	public String GoodsSize(HttpServletRequest resquest,HttpServletResponse response) {
		
		return PathConstant.GoodsSize;
	}
	
}
