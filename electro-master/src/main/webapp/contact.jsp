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
					<h3 class="breadcrumb-header">Contact</h3>
					<ul class="breadcrumb-tree">
						<li><a href="index.jsp">Home</a></li>
						<li class="active">Contact</li>
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
					<!-- Contact -->
					<form action="contact" method="post">
						<div class="billing-details">
							<span class="text-danger">${msg}</span>
							<span class="text-success">${msg1}</span>
							<div class="section-title">
								<h3 class="title">Contact Form</h3>
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
								<input class="input" type="text" name="reason"
									placeholder="Reason" id="reason">
							</div>
							<div class="form-group">
								<input class="input" type="text" name="comment"
									placeholder="comment" id="comment">
							</div>


							<button type="submit" class="primary-btn order-submit">Submit</button>
						</div>
					</form>
					<!-- /Contact -->
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