<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>JSTL_SQL_Tag</title>
</head>
<body>
	<sql:setDataSource driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/practices?user=root" var="ds" />
	<sql:query var="data" dataSource="${ds}">
	select * from product
	</sql:query>

	<table class="table table-success table-striped text-center">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Product Name</th>
				<th scope="col">Product Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dt" items="${data.rows}">

				<tr>
					<th scope="row"><span>${dt.pid}</span></th>
					<td><span>${dt.pname}</span></td>
					<td><span>${dt.price}</span></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>