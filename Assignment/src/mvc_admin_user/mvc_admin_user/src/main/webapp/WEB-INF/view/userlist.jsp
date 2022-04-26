<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>

</table>

<table align="center" border="1px">
<form action="searchuser">
<tr>
<td><lable>Search by email</lable></td>
<td><input type="text" name="email"/></td>
<td><input type="Submit" value="Search"></td>
${msg}
</tr>
</form>
<h1 align="center">List of User</h1>

 <tr>
   <td>User ID</td>
   <td>First Name</td>
   <td>Last Name</td>
   <td>Email</td>
   <td>Gender</td>
   <td>Date of birth</td>
   <td>Date of Registration</td>
   <td>Action</td>
 </tr>
<c:forEach var="ul" items="${userlist}">
  <tr>
    <td>${ul.userid}</td>
    <td>${ul.fname}</td>
    <td>${ul.lname}</td>
    <td>${ul.email}</td>
    <td>${ul.gender}</td>
    <td>${ul.dob}</td>
    <td>${ul.dateofRegstration}</td>
    <td><a href="viewprofile?id=${ul.userid}">View Profile</a></td>
  </tr>
</c:forEach>
<c:forEach var="al" items="${ulist}">
<tr>
    <td>${al.userid}</td>
    <td>${al.fname}</td>
    <td>${al.lname}</td>
    <td>${al.email}</td>
    <td>${al.gender}</td>
    <td>${al.dob}</td>
    <td>${al.dateofRegstration}</td>
    <td><a href="viewprofile?id=${al.userid}">View Profile</a></td>
  </tr>
</c:forEach>
</table>
</body>
</html>