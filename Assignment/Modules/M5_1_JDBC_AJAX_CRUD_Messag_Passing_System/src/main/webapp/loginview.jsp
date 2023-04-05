<%@page import="com.model.Email"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.model.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All Data</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
	integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
	integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<div class="row justify-content-center my-3">
			<div class="col-lg-9 m-auto ">

				<%
				String email = (String) session.getAttribute("email");
				
				%>

				<h1
					style="text-align: center; background-color: #8080FF; color: #E6FFEA"
					class="py-1">View Login Data</h1>

				<h2 style="color: gray;">
					Welcome
					<%=email%></h2>

				<table class="table table-success table-striped">
					<thead>
						<tr class="text-center">
							<th scope="col">User id</th>
							<th scope="col">First Name</th>
							<th scope="col">Last Name</th>
							<th scope="col">Email</th>
							<th scope="col">Phone No.</th>
							<th scope="col">Password</th>
							<th scope="col" colspan="2">Action</th>
						</tr>
					</thead>

					<%
					User us=(User)request.getAttribute("use");
					%>
					<tbody>
						<tr>
							<th scope="row">
								<%=us.getUid()%>
							</th>
							<td><%=us.getFname()%></td>
							<td><%=us.getLname()%></td>
							<td><%=us.getEmail()%></td>
							<td><%=us.getPhno()%></td>
							<td><%=us.getPass()%></td>
							<td><button class="btn btn-danger">
									<a href="delete?did=<%=us.getUid()%>"
										style="text-decoration: none; color: white;">Delete</a>
								</button></td>
							<td><button class="btn btn-info" >
									<a href="update?usid=<%=us.getUid()%>"
										style="text-decoration: none; color: white;">Update</a>
								</button></td>

						</tr>

					</tbody>
							
					
								
				</table>
				<div class="d-grid justify-content-md-end">
					<a href="EmailIndex.jsp" style="text-decoration: none; color: white;"
						class="btn btn-success mb-3 ">Send Mail</a>
				</div>
				
			<!--  email view table -->
				
				
				<h1
					style="text-align: center; background-color: #8080FF; color: #E6FFEA"
					class="py-1 mt-5">Send email by user</h1>
					
					
				<table class="table table-success table-striped ">
					<thead>
						<tr class="text-center">
							<th scope="col">Email Id</th>
							<th scope="col">From</th>
							<th scope="col">Password</th>
							<th scope="col">To</th>
							<th scope="col">Subject</th>
							<th scope="col">Message</th>
							
						</tr>
					</thead>

					<%
					ArrayList<Email> em=(ArrayList)request.getAttribute("edata");
					
					
					for (Email e:em) {
					%>
					<tbody>
						<tr>
							<th scope="row">
								<%=e.getEid()%>
							</th>
							<td><%=e.getFrom1()%></td>
							<td><%=e.getPass()%></td>
							<td><%=e.getTo1()%></td>
							<td><%=e.getSub()%></td>
							<td><%=e.getMsg()%></td>
							

						</tr>

					</tbody>
					<%
					}
					%>		
					
								
				</table>

			</div>
		</div>
	</div>
</body>
</html>