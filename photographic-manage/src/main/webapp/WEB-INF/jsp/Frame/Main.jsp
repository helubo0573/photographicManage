<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../common.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>翰格天行影楼管理系统</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/P-Main.css?d=201907012">
</head>
<body style="background-color: black;">
	<div class="body-div">
		<div class="frame-box top-div">
			<%@include file="./Top.jsp"%>
		</div>
		<%-- <div class="frame-box headbar-div">
			<%@include file="./HeadBar.jsp" %>
		</div> --%>
		<div class="content-div">
			<div class="frame-box sider-div">
				<%@include file="./Sider.jsp" %>
			</div>
			<div class="frame-box workbench-div">
				<%@include file="./Workbench.jsp" %>
			</div>
		</div>
	</div>
</body>
</html>