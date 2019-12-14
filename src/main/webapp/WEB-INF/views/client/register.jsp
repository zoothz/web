<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method ="POST" action="/register" modelAttribute="account">
		<input type="text" name="username"/><lable>username</lable><br>
		<input type="password" name="password"/><lable>password</lable><br>
		<input type="text" name="fullname"/><lable>fullname</lable><br>
		<input type="email" name="email"/><lable>email</lable><br>
		<input type="text" name="address"/><lable>address</lable><br>
		<input type="text" name="phone"/><lable>phone</lable><br>
		<button type="submit">sumit</button>
	</form>
</body>
</html>