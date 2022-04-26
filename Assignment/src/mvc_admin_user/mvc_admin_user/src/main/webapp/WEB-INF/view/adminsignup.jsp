<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
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
  background-color: #4CAF50;
  color: white;
  padding: 8px 20px;
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
<meta charset="ISO-8859-1">
<title>admin details</title>
</head>
<body>
<form:form action="SignUpSubmit" modelAttribute="objuser">
<table align="center">
<tr>
  <td>Name</td>
  <td><form:input path="adminname"/>
   
  </td>
 </tr>
 <tr>
  <td>Password</td>
  <td><form:password path="password"/>
   
  </td>
 </tr>
  <tr>
  <td colspan="2"><input type="submit" value="signup"/></td>
 </tr>
</table>
</form:form>
</body>
</html>