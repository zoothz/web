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
<h1>login</h1>
	<form action="login" var="user" method="POST" model = "login">
		
		<input name="username" type="text" ><lable>username</lable>
		<input name="password " type="text" ><lable>password</lable>
		<button type="submit">Login</button>
	</form>
</body>
</html>