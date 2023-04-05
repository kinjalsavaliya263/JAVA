<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Electro - HTML Ecommerce Template</title>


</head>
<body>


	<!-- BREADCRUMB -->
	<div id="breadcrumb" class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
				<div class="col-md-12">
					<h3 class="breadcrumb-header">Registration</h3>
					<ul class="breadcrumb-tree">
						<li><a href="index.jsp">Home</a></li>
						<li class="active">Registration</li>
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
					<!-- Registration -->
					<form action="reg" method="post">
						<div class="billing-details">
							<span class="text-success">${msg}</span> <span
								class="text-danger">${msg1}</span>
							<div class="section-title">
								<h3 class="title">Registration Form</h3>
							</div>
							<div class="form-group">
								<input class="input" type="text" name="fname"
									placeholder="First Name" id="fname">
							</div>
							<div class="form-group">
								<input class="input" type="text" name="lname"
									placeholder="Last Name" id="lname">
							</div>
							<div class="form-group">
								<input class="input" type="email" name="email"
									placeholder="Email" id="email">
							</div>
							<div class="form-group">
								<input class="input" type="text" name="phno"
									placeholder="Phone No." id="phno">
							</div>
							<div class="form-group">
								<input class="input" type="password" name="pass"
									placeholder="Password" id="pass">
							</div>
							<div class="form-group">
								<input class="input" type="password" name="cpass"
									placeholder="Conform Password" id="cpass">
							</div>
							<div class="form-group">
								<input class="input" type="text" name="address"
									placeholder="Address">
							</div>

							<div class="form-group">
								<button type="submit" class="primary-btn order-submit">Registration</button>
							</div>
							<div class="form-group">
								<h5>
									Already a user? <a href="login.jsp">LogIn</a>
								</h5>
							</div>
						</div>
					</form>
					<!-- /Registration -->



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