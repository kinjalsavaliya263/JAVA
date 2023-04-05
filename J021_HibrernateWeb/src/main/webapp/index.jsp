<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
       <form action="reg" method="post" enctype="multipart/form-data">
		<input type="hidden" name="uid" value="${data.getId()}">
		<input type="text" name="name" placeholder="enter name" value="${data.getName()}"><br>
		<input type="text" name="email" placeholder="enter email" value="${data.getEmail()}"><br>
		<input type="radio" name="gender" value="male" checked="checked"> Male
		<input type="radio" name="gender" value="female"> Female <br>
		<select name="country">
		<option value="india">India</option>
		<option value="usa">USA</option>
		</select>
		<input type="file" name="file">
		<input type="submit">
	   </form>
		<a href="display">View all data</a>
</body>
</html>