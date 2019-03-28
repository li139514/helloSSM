<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="js/jquery-3.0.0.js"></script>

<script type="text/javascript">

</script>
<style>
	table,tr,th,td{
		border: 1px solid;
	}
</style>
<body>
	<table align="center">
		<tr>
		<th colspan="4">学院信息&nbsp;&nbsp;&nbsp;<a href="add.do">添加</a></th>
		</tr>
		<tr>
			<td>ID</td>
			<td>英文名</td>
			<td>姓名</td>
			<td>用户操作</td>
		</tr>
		<c:forEach items="${userList }" var="user">
		<tr>
			<td>${user.id }</td>
			<td>${user.userCode }</td>
			<td>${user.userName }</td>
			<td>
				<a href="selectById.do?id=${user.id }">修改</a>&nbsp;&nbsp;
				<a href="delete.do?id=${user.id }">删除</a>
			</td>
		</tr>
		</c:forEach>
	</table>


</body>
</html>