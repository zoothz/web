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
	
	<table>
    <tr>
      <th>Id</th>
      <th>Name</th>
      <th>Address</th>
      <th>View</th>
      <th>Edit</th>
      <th>Delete</th>
    </tr>
      <c:forEach var="user" items="${listuser}">
        <tr style="border: 1px black solid">
          <td>${user.id}</td>
          <td>${user.username}</td>
          <td>${user.address}</td>
          </tr>
      </c:forEach>
   
  </table>
	
</body>
</html>