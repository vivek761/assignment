<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="al" items="${userlist}">
		<table align="center">

			<tr>
				<td>User Id</td>
				<td>${al.userid}</td>
			</tr>
			<tr>
				<td>First name</td>
				<td>${al.fname}</td>
			</tr>
			<tr>
				<td>Last name</td>
				<td>${al.lname}</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${al.email}</td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>${al.gender}</td>
			</tr>
			<tr>
				<td>Date of birth</td>
				<td>${al.dob}</td>
			</tr>
			<tr>
				<td>Date of Regstration</td>
				<td>${al.dateofRegstration}</td>
			</tr>
		</table>
	</c:forEach>
</body>
</html>