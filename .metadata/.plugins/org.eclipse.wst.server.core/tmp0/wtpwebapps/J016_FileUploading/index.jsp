<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
	<form action="upload" method="post" enctype="multipart/form-data">
		<input type="text" name="uname"> <input type="file"
			name="file"> <input type="submit">
	</form>

	<table border="1">
		<tr>
			<th>Id</th>
			<th>Username</th>
			<th>Image</th>
		</tr>
		
		<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practices?user=root");
		PreparedStatement ps=cn.prepareStatement("select * from upload");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
		%>
		
		<tr>
		<td><%=rs.getInt(1) %></td>
		<td><%=rs.getString(2) %></td>
		<td><img alt="" src="img//<%=rs.getString(3) %>" height="100px" width="100px"></td>
		</tr>
		<% }
		%>
	</table>
</body>
</html>