package com.heav.photographic.core.common.constant;

public class PathConstant {

	/**登录后进入工作页面**/
	public static final String FrameMainPage="forward:/WEB-INF/jsp/Frame/Main.jsp";
	/**工作台**/
	public static final String FrameWorkbenchPage="forward:/WEB-INF/jsp/Frame/Workbench.jsp";	//首页
	
	/***订单管理*/
	public static final String OrderInfo="forward:/WEB-INF/jsp/SalesManage/Orders/OrderInfo.jsp";  //订单信息管理
	public static final String EntireManage="forward:/WEB-INF/jsp/SalesManage/Entire/Manage.jsp";//拍摄套餐管理
	
	/*** 产品信息管理*/
	public static final String GoodsType="forward:/WEB-INF/jsp/GoodsManage/GoodsType/Manage.jsp";	//产品类型管理
	public static final String GoodsSize="forward:/WEB-INF/jsp/GoodsManage/GoodsSize/Manage.jsp"; 	//产品规格管理 
	public static final String GoodsManage="forward:/WEB-INF/jsp/GoodsManage/GoodsInfo/Manage.jsp";	//信息管理
	
	/*** 个人中心*/
	public static final String MemberDetailInfo="forward:/WEB-INF/jsp/MemberCenter/MemberDetailInfo/MemberDetailInfo.jsp"; //用户详细信息
	
	public static final String ResetPassword="forward:/WEB-INF/jsp/MemberCenter/ResetPassword/ResetPassword.jsp"; //找回密码
	
	
	/***其他页面**/
	public static final String ErrorPage="forward:/404.jsp";
}
