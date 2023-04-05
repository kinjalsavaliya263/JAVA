<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->



</head>
<body>


	<!-- BREADCRUMB -->
	<div id="breadcrumb" class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
				<div class="col-md-12">
					<h3 class="breadcrumb-header">Update Password</h3>
					<ul class="breadcrumb-tree">
						<li><a href="index.jsp">Home</a></li>
						<li class="active">Update Password</li>
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
					<!-- Login -->
					<form action="updatepass" method="post">
						<div class="billing-details">
							<span class="text-danger">${msg}</span>
							<span class="text-success">${msg}</span>
							<div class="section-title">
								<h3 class="title">Update Password</h3>
							</div>

							<div class="form-group">
								<input class="input" type="password" name="pass"
									placeholder="New password" id="pass">
							</div>
							<div class="form-group">
								<input class="input" type="password" name="cpass"
									placeholder="Conform password" id="cpass">
							</div>
							<div class="form-group ">
								<button type="submit" class="primary-btn order-submit">Continue</button>
								
							</div>
							
						</div>
					</form>
					<!-- /Login -->
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