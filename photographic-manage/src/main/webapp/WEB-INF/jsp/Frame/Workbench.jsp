<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
</style>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/tab.js?d=202002091"></script>
<body>
	<div id="page-tab">
		<nav id="page-tab-content">
			<div id="menu-list">
				<a>主页</a>
			</div>
		</nav>
		<div id="page-operation">
			<div id="menu-all">
				<ul id="menu-all-ul">
					<li>主页</li>
				</ul>
			</div>
		</div>
	</div>
	<div id="page-content" style="height: calc(100% - 155px);"></div>
</body>
<script type="text/javascript">
	$("menu_a").tab();
</script>
</html>