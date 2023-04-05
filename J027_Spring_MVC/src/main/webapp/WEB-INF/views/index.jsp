<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Registration</h1>

	<form:form action="addEmp" method="post" modelAttribute="emp">
		<form:hidden path="id"/>
		<form:label path="name">Name</form:label>
		<form:input path="name" />
		<form:label path="email"></form:label>
		<form:input path="email" />
		<form:label path="pass"></form:label>
		<form:password path="pass" />
		<input type="submit">
	</form:form>
	<a href="view">view allEmp</a>
</body>
</html>