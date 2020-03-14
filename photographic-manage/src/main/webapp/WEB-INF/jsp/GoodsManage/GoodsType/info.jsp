<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<div style="padding: 10px;	text-align: center;">
		<div class="h5" style="border-bottom: 60%;margin-bottom: 20px;">
			产品类型信息
		</div>
		<div id="goodstype-info" class="info-div">
			<div class="form-horizontal"  style="overflow: hidden;">
				<div class="form-group">
					<label for="ftype" class="col-lg-3 control-label">所属类型:</label>
				    <div class="col-lg-7">
				    	<select class="form-control" id="ftype" placeholder="请选择所属类型">
				    		<option>请选择……</option>
				    	</select>
				    </div>
				</div>
				<div class="form-group">
				    <label for="tyename" class="col-lg-3 control-label">类型名称:</label>
				    <div class="col-lg-7">
				      <input type="text" class="form-control" id="typename" placeholder="请输入类型名称">
				    </div>
				</div>
				<div class="form-group">
				    <label for="tyename" class="col-lg-3 control-label">备注:</label>
				    <div class="col-lg-7">
				      <textarea id="remarks" class="form-control" rows="3" cols="" style="resize: none;" placeholder="请填写类型说明"></textarea>
				    </div>
				</div>
			</div>
		</div>
		<div id="goodstype-btn" class="btn-div">
			<button id="insert-btn" class="btn btn-success" onclick="InsertBtnState()">新增</button>
			<button id="update-btn" class="btn btn-info" onclick="UpdateBtnState()">修改</button>
			<button id="delete-btn" class="btn btn-danger">删除</button>
			<button id="reset-btn" class="btn btn-warning">重置</button>
		</div>
	</div>
</body>
</html>