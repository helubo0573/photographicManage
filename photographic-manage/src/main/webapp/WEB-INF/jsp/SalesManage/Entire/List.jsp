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
	<div class="list-div">
		<table class="table table-hover" style="border-bottom: 1px solid #fff;">
			<thead>
				<tr>
					<th>
						套餐类型
					</th>
					<th>
						套餐名称
					</th>
					<th>
						套餐价格
					</th>
					<th>
						服装套数
					</th>
					<th>
						底片张数
					</th>
					<th>
						备注
					</th>
				</tr>
				
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>1</td>
					<td>1</td>
					<td>1</td>
					<td>1</td>
					<td>1</td>
				</tr>
				<tr>
					<td>1</td>
					<td>1</td>
					<td>1</td>
					<td>1</td>
					<td>1</td>
					<td>1</td>
				</tr>
				<c:forEach items="${entire }" var="list">
					<tr>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
		</div>
	</div>
</body>
</html>