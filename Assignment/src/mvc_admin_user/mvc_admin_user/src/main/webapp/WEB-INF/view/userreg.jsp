<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style>
.error {
	color: red;
	background-color: cyan;
}
</style>
<meta charset="ISO-8859-1">
<title>admin details</title>
<style>
input[type=text], select {
  width: 100%;
  padding: 8px 20px;
  margin: 3px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=password], select {
  width: 100%;
  padding: 8px 20px;
  margin: 3px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 5px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
a{
color:#FF0000;
}
</style>
</head>
<body>
<h1 align="center">User Registration</h1>
	<form:form action="usersubmit" modelAttribute="objuser">
		<table width="40%" align="center">
			<tr>
				<td>First Name</td>
				<td><form:input path="fname" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lname" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" /><a>${msg}</a></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><form:input path="gender" /></td>
			</tr>
			<tr>
				<td>Date of birth</td>
				<td><form:input path="dob" /></td>
			</tr>
			<tr>
				<td>Date of Registration</td>
				<td><form:input path="dateofRegstration" /></td>
			</tr>
			<tr>
				<td>sec_question</td>
				<td><form:input path="sec_question" /></td>
			</tr>
			<tr>
				<td>sec_answer</td>
				<td><form:input path="sec_answer" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="signup" /></td>
			</tr>
		</table>
			
	</form:form>

</body>
</html>