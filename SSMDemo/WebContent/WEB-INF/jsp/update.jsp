<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<form action="updateById.do" method="post">
	<input type="hidden" name="id" value="${user.id }">
	<table align="center">
		<tr>
		<th colspan="2">修改学员信息</th>
		</tr>
		<tr>
			<td>英文名</td>
			<td><input type="text" name="userCode" value="${user.userCode}"></td>
		</tr>
		<tr>
			<td>姓名</td>
			<td><input type="text" name="userName" value="${user.userName}"></td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="修改">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="reset" value="重置">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>