<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<div class="body-bdiv">
		<div class="title-div">
			拍摄套餐管理
		</div>
		<div class="box-div form-inline" style="overflow: hidden;text-align: left;">
			<div class="input-group input-group-sm col-lg-3">
	            <span class="th input-group-addon">套餐类型</span>
	            <input type="text" class="form-control" placeholder="">
	        </div>
	        <div class="input-group input-group-sm col-lg-3">
	            <span class="th input-group-addon">套餐名称</span>
	            <input type="text" class="form-control" placeholder="">
	        </div>
	        <div class="input-group input-group-sm col-lg-3">
	            <span class="th input-group-addon">套餐价格</span>
	            <input type="text" class="form-control" placeholder="最小值">
	            <span class="input-group-addon">-</span>
	            <input type="text" class="form-control" placeholder="最大值">
	        </div>
		</div>
		<div class="btn-Rdiv">
			<button style="float:left;" class="btn btn-success">套餐类型维护</button>
			<button class="btn btn-info">新增</button>
			<button class="btn btn-warning">修改</button>
			<button class="btn btn-danger">删除</button>
		</div>
		<div>
			<%@include file="List.jsp" %>
		</div>
	</div>
</body>
</html>