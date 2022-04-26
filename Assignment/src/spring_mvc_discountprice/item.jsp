<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
<form action="home" >
<table align="center">
	 <tr>
	   <td>name</td>
	   <td><input type="text" name="name"></td>	   
	 </tr>
	<tr>
	   <td>price</td>
	   <td><input type="number" name="price"></td>	   
	 </tr>
	 <tr>
	   <td>quantity</td>
	   <td><input type="number" name="qty"></td>	   
	 </tr>
	 <tr>
	   <td>discount</td>
	   <td><input type="number" name="dis"></td>	   
	 </tr>
	 <tr>	    
	   <td colspan="2"><input type="submit" value="submit"></td>	   
	 </tr>
	</table>
</form>

</body>
</html>