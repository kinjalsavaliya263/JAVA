<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>log in</title>
</head>
<body>
	<form action="login" method="post">
		<span style="color: red">${err}</span> <input type="text"
			name="username" placeholder="Enter username"> <input
			type="text" name="password" placeholder="Enter password"> <input
			type="submit">
	</form>
</body>
</html>