<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="./css/Commons.css">
    <link rel="stylesheet" type="text/css" href="./css/P-Login.css?v=20200221801">
	<title>翰格天行影楼经营管理系统</title>
</head>
<body onkeydown="keyLogin()">
	<div class="login-box frame-box">
		<h2>翰格天行影楼经营管理系统</h2>
		<div class="form-horizontal login-form"> <!-- 让表单在一行中显示form-horizontal -->
          	<div class="form-group">
              	<label for="username" class="col-lg-3 control-label">用户名</label>
              	<div class="col-lg-9">
                	<input type="text" id="username" class="form-control" placeholder="请输入账号">
              	</div>              
          	</div>
          	<div class="form-group">
              	<label for="password" class="col-lg-3 control-label">密&nbsp;&nbsp;&nbsp;&nbsp;码</label>
            	<div class="col-lg-9">
                	<input type="password" id="password" class="form-control" placeholder="请输入密码">
            	</div>              
			</div>
			<div class="form-group">
              	<label for="checkcode" class="col-lg-3 control-label">验证码</label>
            	<div class="col-lg-4">
                	<input class="form-control" id="code-input" type="text" maxlength="4">
            	</div>
            	<div class="col-lg-5">
             		<img id="codeimg" src="user/getimgcode.do" style="position:static;">
            	</div>
			</div>
			<div class="form-group">
               	<span>
                   	<label id="learn-lb"><input type="checkbox" name="" style="margin-bottom: 5px;" class="checkbox-inline">记住用户名</label> 
               	</span>
               	<input type="button" id="loginbt" value="登  录" class="btn btn-danger btn-lg">
			</div>
			<div class="form-group">
            	<div class="col-lg-12 register-info">              
	           		<label>没有账号请点此<a href="Register.jsp" target="_blank" class="register-a">注册</a></label>
				</div>
	   		</div>
   		</div>
		<div class="rightpic">
			<div id="container">
				<!-- <img src="picture/1.jpg" alt="" width="500px" height="330px"> -->
			</div>
		</div>
	</div>
</body>
<script src="./jquery/jquery-3.3.1.min.js"></script>
<script src="./bootstrap/js/bootstrap.min.js"></script>
<script src="./plugins/delaunay.js"></script>
<script src="./plugins/TweenMax.js"></script>
<script src="./plugins/effect.js"></script>
<script src="./plugins/encrypt.js"></script>
<script src="./plugins/layui/layui.all.js"></script>
<script src="./js/P-Login.js?d=2020022001"></script>
<script type="text/javascript">
$(function(){
	if (window != top) top.location.href = location.href;
})
function keyLogin(){
 if (event.keyCode==13)  //回车键的键值为13
   $("#loginbt").click(); //调用登录按钮的登录事件
}
</script>
</html>