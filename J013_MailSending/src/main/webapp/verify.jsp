<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="verify" method="post">
	
	<span>${err}</span>
	<input type="text"name="otp"placeholder="Enter otp">
	<input type="submit">
	</form>
</body>
</html>