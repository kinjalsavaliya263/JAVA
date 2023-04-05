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
					<h3 class="breadcrumb-header">Verify Code</h3>
					<ul class="breadcrumb-tree">
						<li><a href="index.jsp">Home</a></li>
						<li class="active">Verify Code</li>
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
					<!-- VerifyCode -->
					<form action="verify" method="post">
						<div class="billing-details">
							<span class="text-danger">${msg}</span>
							<span class="text-success">${msg}</span>
							<div class="section-title">
								<h3 class="title">Enter security code</h3>
							</div>
							<div>
							<h6>Please check your email for a message with your code. your code is 6 numbers long.</h6>
							</div>

							<div class="form-group">
								<input class="input" type="text" name="otp"
									placeholder="Enter your otp" id="otp">
							</div>
							
							<div class="form-group ">
								<button type="submit" class="primary-btn order-submit">Continus</button>
								<a href="" class="pull-right">Didn't get code ?</a>
							</div>
							<div class="form-group newsletter">
								<h5>
									<a href="login.jsp">Back to login?</a>
								</h5>
							</div>
						</div>
					</form>
					<!-- /VerifyCode -->
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