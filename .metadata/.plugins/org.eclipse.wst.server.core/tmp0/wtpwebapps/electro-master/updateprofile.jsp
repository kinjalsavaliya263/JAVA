<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">



</head>
<body>


	<!-- BREADCRUMB -->
	<div id="breadcrumb" class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
				<div class="col-md-12">
					<h3 class="breadcrumb-header">My Profile</h3>
					<ul class="breadcrumb-tree">
						<li><a href="index.jsp">Home</a></li>
						<li class="active">My Profile</li>
					</ul>
				</div>
			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	<!-- /BREADCRUMB -->

	<!-- SECTION -->
	<div class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">

				<div class="col-md-7">
					<!-- My profile -->
					<form action="updateprofile" method="post">
						<div class="billing-details">
<%-- 
							<%
							User use = (User) request.getAttribute("use");
							%> --%>

							<span class="text-danger">${msg}</span> <span
								class="text-success">${msg1}</span>
							<div class="section-title">
								<h3 class="title">My Profile</h3>
							</div>
							<div class="form-group">
							<label>First Name:</label>
								<input class="input" type="text" name="fname"
									value="<%=us.getFname() %>" id="fname" >
							</div>
							<div class="form-group">
							<label>Last Name:</label>
								<input class="input" type="text" name="lname"
									value="<%=us.getLname() %>" id="lname">
							</div>
							<div class="form-group">
							<label>Email:</label>
								<input class="input" type="email" name="email"
									value="<%=us.getEmail() %>" id="email" readonly>
							</div>
							<div class="form-group">
							<label>Phone No.:</label>
								<input class="input" type="text" name="phno"
									value="<%=us.getPhno() %>" id="phno" >
							</div>
							
							<div class="form-group">
							<label>Address:</label>
								<input class="input" type="text" name="address"
									value="<%=us.getAddress() %>" >
							</div>

							<div class="form-group">
								<button type="submit" class="primary-btn order-submit">Update</button>
							</div>

						</div>
					</form>
					<!-- /My profile -->



				</div>


			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	<!-- /SECTION -->

	<%@include file="footer.jsp"%>


</body>
</html>