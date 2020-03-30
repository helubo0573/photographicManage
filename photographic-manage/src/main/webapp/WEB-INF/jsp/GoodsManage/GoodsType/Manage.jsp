<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.box-div{
	height: 500px;
	border: 1px solid;
	padding:10px;
}
</style>
</head>
<script type="text/javascript" src="../js/GoodsManage.js?d=202003302"></script>
<body>
	<div class="body-sdiv">
		<div class="title-div">
			产品类型维护
		</div>
		<div class="box-div">
			<div style="float:left;display: inline-block; width: 180px; height: 100%; padding: 10px; border: 1px solid #ddd; overflow: auto;">
				<%@include file="List.jsp" %>
			</div>
			<div style="margin-left: 210px;border: 1px solid;height: 100%;">
				<%@include file="info.jsp" %>
			</div>
		</div>
	</div>
	
</body>
</html>