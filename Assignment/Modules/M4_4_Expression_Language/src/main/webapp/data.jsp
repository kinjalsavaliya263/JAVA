<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>data</title>
</head>
<body>
	<%
	String f1 = request.getParameter("n1");
	String l2 = request.getParameter("n2");
	%>
	<h1><%= f1 %></h1>
	<h1><%= l2 %></h1>
</body>
</html>