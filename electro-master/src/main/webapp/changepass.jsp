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



	<!-- SECTION -->
	<div class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">

				<div class="col-md-7">
					<!-- Login -->
					<form action="changepass" method="post">
						<div class="billing-details">
							<span class="text-danger">${msg}</span>
							<span class="text-success">${msg1}</span>
							<div class="section-title">
								<h3 class="title">Change Password</h3>
							</div>

							<div class="form-group">
								<input class="input" type="password" name="opass"
									placeholder="Old password" id="opass">
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