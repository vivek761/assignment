<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
</head>
<body>
<h1 align="center">User Login</h1>
<form action="usercheck"/>
<table align="center" >
<tr>
<td><lable>Username</lable></td>
<td><input type="text" name="email"/></td>
</tr>
<tr>
<td><lable>Password</lable></td>
<td><input type="password" name="password"/></td>
</tr>
<tr>
<td><input type="Submit" value="login"></td>
</tr>
<tr>
</table>

${msg}

</form>
</body>
</html>