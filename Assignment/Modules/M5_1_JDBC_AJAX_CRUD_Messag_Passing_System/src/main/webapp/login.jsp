<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log in</title>
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
			<div class="col-lg-6 m-auto ">

				<h1 style="text-align: center; background-color: #8080FF;color: #E6FFEA" class="py-2">Log in</h1>


				<form action="login" method="post">
				<span class="text-danger">${msg}</span>
					
					
					<div class="form-group mb-3">
						<label><h4>Email :</h4></label>
						<input type="text" name="email" id="email"class="form-control" onkeyup="validation()">
						<span id="emailE" class="text-danger"></span>
					</div>
					
					<div class="form-group mb-3">
						<label><h4>Password :</h4></label>
						<input type="password" name="pass" id="pass"class="form-control" onkeyup="validation()">
						<span id="passE" class="text-danger"></span>
					</div>
					<div class="d-grid gap-2 col-6 mx-auto">
						<button type="submit" class="btn btn-primary btn-lg" id="sbtn">Log in</button>
					</div>
					
					<div class="my-4"><h6>Need an account ? <a href="index.jsp">Registration</a></h6></div>
					
				</form>
			</div>
		</div>
	</div>

</body>
</html>