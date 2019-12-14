<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="card mb-3">
		<div class="card-header">
			<i class="fas fa-table"></i> User Table
			<input type="text"/>
		</div>
		<div class="card-body">
			<div class="table-responsive">
				<table class="table table-bordered" id="dataTable" width="100%"
					cellspacing="0">
					<thead>
						<tr>
							<th>STT</th>
							<th>user</th>
							<th>pass</th>
							<th>fullName</th>
							<th>email</th>
							<th>address</th>
							<th>phone</th>
							<th>status</th>
							<th>role</th>
							<th>Fuction</th>
						</tr>
					</thead>

					<tbody>
						<c:forEach var="user" items="${user.listResult}">
							<tr>
								<td>${user.id}</td>
								<td>${user.username}</td>
								<td>${user.password }</td>
								<td>${user.fullname }</td>
								<td>${user.email }</td>
								<td>${user.address }</td>
								<td>${user.phone }</td>
								<td>${user.status}</td>
								<td>${user.role }</td>
								<td>
									<a href="<c:url value='/admin/user/view/${user.id}' /> "> view </a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<div class="card-footer small text-muted" id ="today">
		</div>
		<script>
			var today = new Date();
			document.getElementById("today").innerHTML = today;
		</script>
	</div>


</body>
</html>