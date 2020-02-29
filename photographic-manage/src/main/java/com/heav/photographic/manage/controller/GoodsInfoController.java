package com.heav.photographic.manage.controller;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.heav.photographic.core.common.constant.Constant;
import com.heav.photographic.core.common.constant.PathConstant;
import com.heav.photographic.core.common.exception.ServiceException;
import com.heav.photographic.core.common.util.ServletUtils;
import com.heav.photographic.core.common.util.Tree;
import com.heav.photographic.core.domain.GoodsType;
import com.heav.photographic.core.domain.UserInfo;
import com.heav.photographic.core.mapper.GoodsTypeMapper;
import com.heav.photographic.core.service.GoodsTypeService;

@Scope("prototype")
@Controller
public class GoodsInfoController {
	
	@Resource
	private GoodsTypeService goodsservice;
	@Resource
	private GoodsTypeMapper goodsmapper;
	
	@RequestMapping(value="/goods/goodsinfo")
	public String toGoodsInfoManage(HttpServletRequest request,HttpServletResponse response) {
		
		return PathConstant.GoodsManage;
		
	}
	
	@RequestMapping(value="/goods/goodstype")
	public String toGoodsTypeManage(HttpServletRequest request,HttpServletResponse response) throws ServiceException {
		UserInfo user=(UserInfo) request.getSession().getAttribute("SysUser");
		Map<String,Object> param = new HashMap<String, Object>();;
		param.put("org_id", user.getOrgId());
		String goodstypestr=Tree.TreeJson(goodsservice.getTypeList(param), "id", "typename", "parent_id");
		System.out.println(goodstypestr);
		return PathConstant.GoodsType;
	}
	
	@RequestMapping(value="/goods/savegoodstype")
	public void saveGoodsTypeInnfo(HttpServletRequest request,HttpServletResponse response,
			@RequestParam(value = "parentid")int parentId,
			@RequestParam(value = "typename")String typename,
			@RequestParam(value = "remarks")String remarks) {
		UserInfo user=(UserInfo) request.getSession().getAttribute("SysUser");
		GoodsType record=new GoodsType();
		record.setOrgId(user.getOrgId().toString());
		record.setParentId(parentId);
		record.setTypename(typename);
		record.setRemarks(remarks);
		int n=goodsservice.insert(record);
		Map<String, Object> res = new HashMap<String, Object>();
		if (n < 0)
		{
			res.put(Constant.RESPONSE_CODE, Constant.FAIL_CODE_VALUE);
			res.put(Constant.RESPONSE_CODE_MSG, "保存失败");
		} else
		{
			res.put(Constant.RESPONSE_CODE, Constant.SUCCEED_CODE_VALUE);
			res.put(Constant.RESPONSE_CODE_MSG, "保存成功");

		}
		ServletUtils.writeToResponse(response, res);;
	}
	
	@RequestMapping(value="/goods/goodssize")
	public String toGoodsSize(HttpServletRequest resquest,HttpServletResponse response) {
		
		return PathConstant.GoodsSize;
	}
	
}
