package com.heav.photographic.manage.controller;

import java.util.HashMap;
import java.util.List;
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
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("org_id", user.getOrgId());
		String goodstypestr=Tree.TreeJson(goodsservice.getTypeList(param), "id", "typename", "parentId","remarks");
		List<GoodsType> parenttypes=goodsservice.getParentByOrg(user.getOrgId());
		request.setAttribute("typetree", goodstypestr);
		request.setAttribute("parenttypes", parenttypes);
		return PathConstant.GoodsType;
	}
	
	@RequestMapping(value="/goods/savegoodstype")
	public void saveGoodsTypeInnfo(HttpServletRequest request,HttpServletResponse response,
			@RequestParam(value = "typeid")String typeid,
			@RequestParam(value = "parentid")int parentId,
			@RequestParam(value = "typename")String typename,
			@RequestParam(value = "remarks")String remarks) {
		UserInfo user=(UserInfo) request.getSession().getAttribute("SysUser");
		GoodsType record=new GoodsType();
		record.setOrgId(user.getOrgId());
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
		ServletUtils.writeToResponse(response, res);
	}
	
	@RequestMapping(value="/goods/goodssize")
	public String toGoodsSize(HttpServletRequest request,HttpServletResponse response) {
		
		return PathConstant.GoodsSize;
	}
	
	/**
	 * 	获取产品父类型列表
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="/goods/goodstypeparent")
	public void getGoodsTypeParent(HttpServletRequest request,HttpServletResponse response){
		UserInfo user=(UserInfo) request.getSession().getAttribute("SysUser");
		List<GoodsType> goodstypelist=goodsservice.getParentByOrg(user.getOrgId());
		Map<String, Object> res = new HashMap<String, Object>();
		if(goodstypelist!=null) {
			res.put("typelist", goodstypelist);
			res.put(Constant.RESPONSE_CODE_MSG, "查询成功");
		}else {
			res.put(Constant.RESPONSE_CODE, Constant.FAIL_CODE_VALUE);
			res.put(Constant.RESPONSE_CODE_MSG, "查询失败");
		}
		ServletUtils.writeToResponse(response, res);
	}
	
	/**
	 * 	获取产品类型列表树
	 * @param request
	 * @param response
	 * @throws ServiceException 
	 */
	@RequestMapping(value="/goods/getgoodstypetree")
	public void getGoodsType(HttpServletRequest request,HttpServletResponse response) throws ServiceException {
		UserInfo user=(UserInfo) request.getSession().getAttribute("SysUser");
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("org_id", user.getOrgId());
		String goodstypestr=Tree.TreeJson(goodsservice.getTypeList(param), "id", "typename", "parentId","remarks");
		Map<String, Object> res = new HashMap<String, Object>();
		if(goodstypestr!=null) {
			res.put("typetree", goodstypestr);
			res.put(Constant.RESPONSE_CODE_MSG, "查询成功");
		}else {
			res.put(Constant.RESPONSE_CODE, Constant.FAIL_CODE_VALUE);
			res.put(Constant.RESPONSE_CODE_MSG, "查询失败");
		}
		ServletUtils.writeToResponse(response, res);
	}
}
