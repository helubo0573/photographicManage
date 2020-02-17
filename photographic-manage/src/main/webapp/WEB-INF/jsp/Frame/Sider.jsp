<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.menu_dl{
	cursor: pointer;
	font-weight: bold;
}
.menu_dl dt{
	padding-left:40px;
	padding-right:10px;
	background-repeat:no-repeat;
	background-position:10px center;
	color:#f5f5f5;
	font-size:18px;
	position:relative;
	line-height:48px;
	border: 1px solid hsla(0,0%,90%,.5);
}
.menu_dl dd{
	margin-top:5px;
	height: 23px;
	font-size: 12px;
	padding-left:40px;
}
.menu_dl dd,dt{
	cursor: pointer;
}
dl,dt,dd{
	display:block;
	margin:0;
}
.menu_dl>dt img{
	position:absolute;
	right:10px;
	top:20px;
	}
.url_a{
	color: white;
}

dd:hover{
	text-shadow: 0 0 10px #FFFFFF;
	font-size: 16px;
}
dt:hover {
	box-shadow: 0 0 10px #FFFFFF;
	border:1px solid #FFF;
	color: #FFF;
}
</style>
</head>
<body>
	<div id="menu_div">
	</div>
	<%-- <dl class="menu_dl">
		<dt class="custom">订单管理<img src="${pageContext.request.contextPath}/static/img/menu_click.png"></dt>
		<dd class="icon-search">客户管理</dd>
		<dd><a class="menu_a" href="/photographic-manage/goods/manage.do">试用/成交客户管理</a></dd>
		<dd><a class="menu_a">未成交客户管理</a></dd>
		<dd>即将到期客户管理</dd>
	</dl>
	<dl class="menu_dl">
		<dt class="system">产品管理<img src="${pageContext.request.contextPath}/static/img/menu_click.png"></dt>
		<dd>充值记录</dd>
		<dd>短信充值记录</dd>
		<dd>消费记录</dd>
		<dd>操作记录</dd>
	</dl>
	<dl class="menu_dl">
		<dt class="sysconfig">系统管理<img src="${pageContext.request.contextPath}/static/img/menu_click.png"></dt>
		<dd>后台用户管理</dd>
		<dd>角色管理</dd>
		<dd>微功能管理</dd>
		<dd>修改用户密码</dd>
	</dl> --%>
</body>
<script type="text/javascript">
$(document).ready(function(){
	$(function(){
		$.ajax({
			contenType:'application/json',
			Type:'POST',
			dataType:'json',
			url:'../user/getmenu.do',
			success:function(data){
				$.each(data,function(i,m){
					if(m.parentId=="0"){
						var innerHTML="<dl class='menu_dl' data-fid='"+m.id+"'><dt class='"+m.iconCode+"'>"+m.menuName+"<img src='${pageContext.request.contextPath}/static/img/menu_click.png'></dt></dl>";
						$("#menu_div").append(innerHTML)
					}else{
						var innerHTML="<dd><a class='menu_a' href='.."+m.urlPath+"'>"+m.menuName+"</a></dd>";
						$("dl[data-fid='"+m.parentId+"']").append(innerHTML)
					}
				})
				$(".menu_dl dd").hide();
				$(".menu_dl dt").click(function(){
					$(".menu_dl").removeClass("frame-box");
					$(this).parent().addClass("frame-box");
					$(this).parent().find('dd').removeClass("menu_chioce");
					$(".menu_dl dt").find("img").attr("src","${pageContext.request.contextPath}/static/img/menu_click.png");
					$(this).parent().find('img').attr("src","${pageContext.request.contextPath}/static/img/menu_hide.png");
					$(".menu_chioce") .slideUp();
					$(this).parent().find('dd').slideToggle();
					$(this).parent().find('dd').addClass("menu_chioce");
				});
				$(".menu_dl a").tab();
			}
		})
	});
});
</script>
</html>