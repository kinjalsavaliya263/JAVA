<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 	
	3.Write a Java program to submit student information (fname, lname, 
	  email, mobile, gender, password) using jsp form to servlet. Fetch data at 
	  servlet and print all the data in console.  -->


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<title>Student Registration form</title>

</head>
<body>

	<div class="container">
		<div class="row mt-3">
			<div class="col-lg-6 m-auto px-5">
				<div style="text-align: center; background-color: #B284BE;">
					<h1>Student Registration form</h1>
				</div>
				
				<span class="text-success"></span>
				<form action="data" method="post">
				
				<div class="form-group mb-3">
					<label class="form-label">First Name</label>
					<input type="text" name="fname" id="fname" class="form-control">
					<span id="fnameE" class="text-danger"></span>
				</div>
				
				<div class="form-group mb-3">
					<label class="form-label">Last Name</label>
					<input type="text" name="lname" id="lname" class="form-control">
					<span id="lnameE" class="text-danger"></span>
				</div>
				
				<div class="form-group mb-3">
					<label class="form-label">Email</label>
					<input type="text" name="email" id="email" class="form-control">
					<span id="emailE" class="text-danger"></span>
				</div>
				
				<div class="form-group mb-3">
					<label class="form-label">Mobile No.</label>
					<input type="text" name="mono" id="mono" class="form-control">
					<span id="monoE" class="text-danger"></span>
				</div>
				
				<div class="form-group mb-3">
					<label class="form-label">Gender</label>
					<div>
						<input type="radio" name="gender" value="male" id="male" class="form-chek-input">
						<label>Male</label>
						<input type="radio" name="gender" value="female" id="female" class="form-chek-input">
						<label>Female</label>
					</div>
					<span id="lnameE" class="text-danger"></span>
				</div>
				
				<div class="form-group mb-3">
					<label class="form-label">Password</label>
					<input type="password" name="pass" id="pass" class="form-control">
					<span id="passE" class="text-danger"></span>
				</div>
				
				<div class="form-group mb-3">
					<label class="form-label">Conform Password</label>
					<input type="password" name="cpass" id="cpass" class="form-control">
					<span id="cpassE" class="text-danger"></span>
				</div>
				
				<button type="submit" class="btn btn-primary btn-lg" id="sbtn">Submit</button>
				<!-- <button type="reset" class="btn btn-success btn-lg" id="rbtn">Reset</button> -->
				</form>
			<!-- 	<a href="data"><button class="btn btn-primary btn-lg">Submit</button></a> -->
			</div>
		</div>
	</div>
</body>
</html>