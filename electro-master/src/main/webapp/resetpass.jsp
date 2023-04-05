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
					<h3 class="breadcrumb-header">Reset Password</h3>
					<ul class="breadcrumb-tree">
						<li><a href="index.jsp">Home</a></li>
						<li class="active">Reset Password</li>
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
					<!-- Reset password -->
					<form action="resetpass" method="post">
						<div class="billing-details">
							<span class="text-danger">${msg}</span>
							<span class="text-success">${msg}</span>
							<div class="section-title">
								<h3 class="title">Reset Password</h3>
							</div>

							<div class="form-group">
								<input class="input" type="email" name="email"
									placeholder="Email" id="email">
							</div>
							
							<div class="form-group ">
								<button type="submit" class="primary-btn order-submit">Next</button>
								<a href="login.jsp" class="pull-right">Back to login ?</a>
							</div>
						
						</div>
					</form>
					<!-- /Reset password -->
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