<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="./css/Commons.css">
    <link rel="stylesheet" type="text/css" href="./css/P-Register.css?v=201906042">
<title>翰格天行影楼系统用户注册</title>
</head>
<body>
	<div class="body-div frame-box form-horizontal">
		<div class="title-div">
			<h2>用&nbsp;户&nbsp;注&nbsp;册</h2>
		</div>
		<div class="form-group col-lg-12 info-div">
			<label class="col-lg-3 control-label">用户名:</label>
			<div class="col-lg-9">
				<input class="form-control" id="re-username" data-msg="" title="用户名">
			</div>
		</div>
		<div class="form-group col-lg-12 info-div">
			<label class="col-lg-3 control-label">手机号:</label>
			<div class="col-lg-9">
				<input class="form-control" id="re-phone" data-msg="" title="手机号">
			</div>
		</div>
		<div class="form-group col-lg-12 info-div">
			<label class="col-lg-3 control-label">密&nbsp;&nbsp;码:</label>
			<div class="col-lg-9">
				<input class="form-control" type="password" id="re-password" data-msg="" title="密码">
			</div>
		</div>
		<div class="form-group col-lg-12 info-div">
			<label class="col-lg-3 control-label">重复密码:</label>
			<div class="col-lg-9">
				<input class="form-control" type="password" id="re-repassword" data-msg="" title="重复密码">
			</div>
		</div>
		<div class="form-group col-lg-12 info-div">
			<label class="col-lg-3 control-label">验证码:</label>
			<div class="col-lg-9">
				<input class="form-control" style="width:115px;display: inline;" id="re-checkmsg" data-msg="" title="验证码">
				<button id="msg" class="btn btn-info">获取短信验证码</button>
			</div>
		</div>
		<div class="form-group col-lg-12 info-div">
			<label id="learn-lb">
				<input type="checkbox" id="applye-ck" style="margin-bottom: 5px;" class="checkbox-inline">
				阅读并接受
			</label>
			<a>《翰格天行用户协议》</a>及<br><a>《翰格天行用户隐私权保护申明》</a>
		</div>
		<div class="form-group col-lg-12 info-div">
			<label class="col-lg-3 control-label"></label>
			<button class="btn btn-info col-lg-9" id="register-btn">注&nbsp;册&nbsp;用&nbsp;户</button>
		</div>
	</div>
</body>
<script src="./jquery/jquery-3.3.1.min.js"></script>
<script src="./bootstrap/js/bootstrap.min.js"></script>
<script src="./plugins/layer/layer.js"></script>
<script src="./js/P-Register.js?d=201906051"></script>
<script src="./plugins/encrypt.js"></script>
</html>