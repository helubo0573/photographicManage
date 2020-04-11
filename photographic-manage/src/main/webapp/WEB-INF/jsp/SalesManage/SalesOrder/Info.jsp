<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>销售单</title>
<style type="text/css">
.order-table .th{
	width: 70px;
	text-align: right;
}
.order-table div{
	width: 100%;
}
</style>
</head>
<body>
	<form class="form-horizontal box-div" style="height: 805px;" action="">
		<div class="title-div">
			新增销售单
		</div>
		<div class="body-sdiv container" align="center" style="height: 730px">
			<table class="order-table table table-bordered">
				<tbody>
					<tr>
						<td>
							<div class="input-group input-group-sm">
					            <span class="th input-group-addon">男 士</span>
					            <input type="text" class="form-control" placeholder="">
					        </div>
					    </td>
					    <td>
					        <div class="input-group input-group-sm">
					            <span class="th input-group-addon">电 话</span>
					            <input type="text" class="form-control" placeholder="">
					        </div>
					    </td>
					    <td>
					        <div class="input-group input-group-sm">
					            <span class="th input-group-addon">Q Q</span>
					            <input type="text" class="form-control" placeholder="">
					        </div>
				        </td>
					</tr>
					<tr>
						<td>
							<div class="input-group input-group-sm">
					            <span class="th input-group-addon">女 士</span>
					            <input type="text" class="form-control" placeholder="">
					        </div>
					    </td>
					    <td>
					        <div class="input-group input-group-sm">
					            <span class="th input-group-addon">电 话</span>
					            <input type="text" class="form-control" placeholder="">
					        </div>
					    </td>
					    <td>
					        <div class="input-group input-group-sm">
					            <span class="th input-group-addon">Q Q</span>
					            <input type="text" class="form-control" placeholder="">
					        </div>
				        </td>
					</tr>
					<tr>
						<td colspan="3">
							<div class="input-group input-group-sm">
					            <span class="th input-group-addon">联系地址</span>
					            <input type="text" class="form-control" placeholder="">
					        </div>
						</td>
					</tr>
				</tbody>
			</table>
			<table class="order-table table table-bordered">
				<tbody>
					<tr>
					    <td width="188px">
					        <div class="input-group input-group-sm">
					            <span class="th input-group-addon">销售顾问</span>
					            <input type="text" class="form-control point" placeholder="点击选择" maxlength="8" readonly="readonly">
					        </div>
					    </td>
					    <td rowspan="6" width="428">
					    	<div style="border-bottom:solid 1px white;margin-bottom: 5px;text-align: center;">
								产品明细
							</div>
							<div style="text-align: right;margin-bottom: 5px;">
								<a class="btn btn-info btn-xs" style="margin-right: 0px;">添加</a>
							</div>
							<div style="height: 400px;">
								<table class="table" style="margin: 0px;">
									<tr>
										<th width="68px">类型</th>
										<th>名称</th>
										<th width="88px">规格</th>
										<th width="40px">数量</th>
										<th width="40px">删除</th>
										<th width="10px"></th>
									</tr>
								</table>
								<div style="height: 368px;overflow-y: scroll;">
									<table id="GoodsList" class="table table-condensed">
										<tr>
											<td width="68px">相册</td>
											<td>新娘册</td>
											<td width="88px">18寸</td>
											<td width="40px">1</td>
											<td width="40px"><i class="layui-icon layui-unselect smart-delete">ဆ</i></td>
										</tr>
										<tr>
											<td>相册</td>
											<td>新娘册</td>
											<td>18寸</td>
											<td>1</td>
											<td><i class="layui-icon layui-unselect smart-delete">ဆ</i></td>
										</tr>
										<tr>
											<td>摆台</td>
											<td>罗兰</td>
											<td>7寸</td>
											<td>1</td>
											<td><i class="layui-icon layui-unselect smart-delete">ဆ</i></td>
										</tr>
										<tr>
											<td>摆台</td>
											<td>罗兰</td>
											<td>7寸</td>
											<td>1</td>
											<td><i class="layui-icon layui-unselect smart-delete">ဆ</i></td>
										</tr>
										<tr>
											<td>相框</td>
											<td>罗兰</td>
											<td>60X120cm</td>
											<td>1</td>
											<td><i class="layui-icon layui-unselect smart-delete">ဆ</i></td>
										</tr>
									</table>
								</div>
							</div>
					    </td>
					</tr>
					<tr>
						<td>
							<div class="input-group input-group-sm">
					            <span class="th input-group-addon">套餐名称</span>
					            <input type="text" class="form-control point" placeholder="点击选择" readonly="readonly">
					        </div>
					    </td>
					</tr>
					<tr>
						<td>
					        <div class="input-group input-group-sm">
					            <span class="th input-group-addon">套系价格</span>
					            <input type="text" class="form-control" placeholder="" maxlength="6">
					            <span class="input-group-addon">￥</span>
					        </div>
					    </td>
					</tr>
					<tr>
						<td>
							<div class="input-group input-group-sm">
					            <span class="th input-group-addon">服&nbsp;装</span>
					            <input type="text" class="form-control" placeholder="" maxlength="2">
					            <span class="input-group-addon">套</span> 
						    </div>
					    </td>
					</tr>
					<tr height="270px">
						<td>
							<div class="input-group input-group-sm">
							    <span class="th input-group-addon">底&nbsp;片</span>
					            <input type="text" class="form-control" placeholder="" maxlength="3">
					            <span class="input-group-addon">张</span>
					        </div>
						</td>
					</tr>
				</tbody>
			</table>
			<div id="goodstype-btn" class="btn-div">
				<button id="insert-btn" class="btn btn-success" onclick="">提交订单</button>
				<button id="reset-btn" class="btn btn-warning" onclick="">重置</button>
			</div>
		</div>
	</form>
</body>
</html>