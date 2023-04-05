<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page errorPage="error.jsp" %>  
	<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center;">data</h1>
	
	<%
	String fname=request.getParameter("fname");
	String lname=request.getParameter("lname");
	String email=request.getParameter("email");
	String phno=request.getParameter("phno");
	String pass=request.getParameter("pass");

	out.print(fname+" "+lname+" "+email+" "+phno+" "+pass);
	
	
	
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practices?user=root");
	
		PreparedStatement ps=cn.prepareStatement("insert into data1 values(?,?,?,?,?,?)");
		
		ps.setInt(1,0);
		ps.setString(2,fname);
		ps.setString(3,lname);
		ps.setString(4,email);
		ps.setString(5,phno);
		ps.setString(6,pass);
		
		int i=ps.executeUpdate();
		
		if(i>0){
			out.print("data Add......");
		}
		
		
	%>
	
</body>
</html>