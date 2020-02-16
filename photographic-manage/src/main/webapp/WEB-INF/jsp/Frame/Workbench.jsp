<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
#page-tab,#page-tab *{margin:0;padding:0;-webkit-font-smoothing:antialiased}
#page-tab,#page-tab #page-tab-content,#page-tab .tab-btn,#page-tab #page-operation,#page-tab #menu-list,#page-tab #menu-list a{height:30px;line-height:30px}
#page-tab{width:100%;border-bottom:2px solid;position:relative;line-height:30px}
#page-tab-content{width:948px;overflow:hidden}
#page-tab .tab-btn,#page-tab #page-operation{position:absolute;width:30px;text-align:center;z-index:2;top:0}
#page-tab #page-operation{right:0;width:30px;background-image:url(../static/img/list.png);background-position:5px 50%;background-size:16px;background-repeat:no-repeat}
#page-tab #page-operation:hover{cursor: pointer;}
#page-tab #menu-list{float:left}
#page-tab #menu-list a{float:left;text-decoration:none;padding:0 10px 0 20px;border-right:1px solid #f1f0f0;color:#FFF;font-size:12px;cursor:pointer;transition:background-color .5s;-moz-transition:background-color .5s;-webkit-transition:background-color .5s;-o-transition:background-color .5s}
#page-tab #menu-list a:hover{text-shadow: 0 0 10px #FFFFFF;font-weight: bold;text-decoration:underline}
#page-tab #menu-list a.active{color:#000;background-color:#f1f0f0;border-right:0;transition:color .5s;-moz-transition:color .5s;-webkit-transition:color .5s;-o-transition:color .5s;transition:background-color .5s;-moz-transition:background-color .5s;-webkit-transition:background-color .5s;-o-transition:background-color .5s}
#page-tab #menu-list a.active:hover{}
#page-tab .menu-close{width:15px;height:15px;display:inline-block;background-image:url(../static/img/close.png);background-size:15px;background-repeat:no-repeat;vertical-align:middle;margin-left:5px;margin-top:-2px}
#page-tab .menu-close:hover{background-image:url(../static/img/closehover.png)}
#menu-all{width:175px;border:1px solid #000;position:absolute;right:0;z-index:100;min-height:25px;padding:1px;overflow-y:auto;display:none;max-height:380px;top:31px;background-color:#fff}
#menu-all #menu-all-ul{width:100%;height:100%}
#menu-all #menu-all-ul li{list-style:none;padding:5px 19px 5px 7px;cursor:pointer;overflow:hidden;font-size:12px}
#menu-all #menu-all-ul li.active{background-color:#000;color:#fff}
#menu-all #menu-all-ul li:not(.active):hover{background-color:#f1f0f0}
#page-content{width:100%;height:100%;overflow:hidden}
#page-content .iframe-content{width:100%;height:100%;border:0;display:none}
#page-content .active{display:block}
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