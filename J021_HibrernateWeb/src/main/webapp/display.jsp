<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>USer details</h1>
		<table border="1" width="100%"> 
		<tr>
		<td>Id</td>
		<td>Name</td>
		<td>Email</td>
		<td>Gender</td>
		<td>Country</td>
		<td>Image</td>
		</tr>
		
		
		<c:forEach var="dt" items="${data}">
		<tr>
		<td>${dt.getId()}</td>
		<td>${dt.getName() }</td>
		<td>${dt.getEmail()}</td>
		<td>${dt.getGender() }</td>
		
		<td>${dt.getCountry() }</td>
		<td><img alt="" src="img/${dt.getFilename()}" width="150px" height="100px"></td>
		<td><a href="update?uid=${dt.getId()}&&action=delete">Delete</a> </td>
		<td><a href="update?uid=${dt.getId()}&&action=update">Update</a> </td>
	
	
		</tr>
		
		</c:forEach>
		
		
		
		
		</table>
</body>
</html>