<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	table,tr,th,td{
		border:1px solid;
	}
</style>
<body>
	<form action="toadd.do" method="post">
	<table align="center">
		<tr>
		<th colspan="2">添加学员信息</th>
		</tr>
		<tr>
			<td>英文名</td>
			<td><input type="text" name="userCode"></td>
		</tr>
		<tr>
			<td>姓名</td>
			<td><input type="text" name="userName"></td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="添加">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="reset" value="重置">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>