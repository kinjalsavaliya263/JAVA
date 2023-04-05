<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="true" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<%!public int r; %>
			<%
			r = 50;
			int a = 10;
			int b = 20;
			
			
			%>
			<%=a+b %>
			
			<span>${msg}</span>
			<span>abc</span>
			<span>${sdss}</span>
			
			
			<%
			int a1 = 10;
			int b1	 = a/0;
			
			%>
</body>
</html>