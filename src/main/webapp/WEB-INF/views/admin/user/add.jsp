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
<form:form role="form" action="add" method="post" modelAttribute="user">
	<label>userName</label><input type="text" placeholder="Username" name="username"/><br>
	<label>password</label><input type="password"placeholder="Password" name="password"/><br>
	<label>fullName</label><input type="text" placeholder="FullName" name="fullname" /><br>
	<label>email</label><input type="text" placeholder="Email" name="email" /><br>
	<label>address</label><input type="text"placeholder="Address" name="address" /><br>
	<label>phone</label><input type="text" placeholder="Phone" name="phone" /><br>
	<button type="submit">add</button>
</form:form>
</body>
</html>