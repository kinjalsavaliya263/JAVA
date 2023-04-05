<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 6. Write a Java program to validate jsp form server side.
		First Name: Only Alphabets 
		Last Name: Only Alphabets 
		Mobile: Only 10 Numbers 
		Email: Standard Email Id
		Password: Minimum One 1 Upper, Minimum 1 Lower, Minimum 1 Digit, Minimum 1 Special 
		Character from @, #, $, %, _, & I2. Write CRUD operation using jsp only.-->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<title>JSP_CRUD</title>
<script type="text/javascript">
	function validation() {
		var fname = document.getElementById("fname").value
		var lname = document.getElementById("lname").value
		var email = document.getElementById("email").value
		var pass = document.getElementById("pass").value
		var cpass = document.getElementById("cpass").value
		var phno = document.getElementById("phno").value
		var fnameE = document.getElementById("fnameE");
		var lnameE = document.getElementById("lnameE");
		var emailE = document.getElementById("emailE");
		var passE = document.getElementById("passE");
		var cpassE = document.getElementById("cpassE");
		var phnoE = document.getElementById("phnoE");
		var sbtn = document.getElementById("sbtn");

		var emailExp = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/

		var passExp = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;

		var phnoExp = /^\d{10}$/;

		if (fname == "" || fname == null) {
			fnameE.innerHTML = "Firstname should not be blank"
			sbtn.disabled = true;
			return;
		} else {
			fnameE.innerHTML = ""
			sbtn.disabled = false;
		}

		if (lname == "" || lname == null) {
			lnameE.innerHTML = "Lastname should not be blank"
			sbtn.disabled = true;
			return;
		} else {
			lnameE.innerHTML = ""
			sbtn.disabled = false;

		}

		if (email == "" || email == null) {
			emailE.innerHTML = "Email should not be blank"
			sbtn.disabled = true;
			return;
		} else if (!emailExp.test(email)) {
			emailE.innerHTML = "Invalid email format"
		} else {
			emailE.innerHTML = ""
			sbtn.disabled = false;
		}

		if (phno == "" || phno == null) {
			phnoE.innerHTML = "Phone Number should not be blank"
			sbtn.disabled = true;
			return;
		} else if (!phnoExp.test(phno)) {
			phnoE.innerHTML = "Invalid phone Number"
			sbtn.disabled = true;
			return;
		} else {
			phnoE.innerHTML = ""
			sbtn.disabled = false;
			

		}

		if (pass == "" || pass == null) {
			passE.innerHTML = "Password should not be blank"
			sbtn.disabled = true;
			return;
		} else if (!passExp.test(pass)) {
			passE.innerHTML = "Invalid password	"
			sbtn.disabled = true;
			return;
		} else {
			passE.innerHTML = ""
			sbtn.disabled = false;
		}

		if (cpass != pass) {
			cpassE.innerHTML = "confirm password should be same as a password"
			sbtn.disabled = true;
			return;
		} else {
			cpassE.innerHTML = ""
			sbtn.disabled = false;
		}

	}
</script>

</head>
<body>

	<div class="container">
		<div class="row mt-3">
			<div class="col-lg-6 m-auto px-5">
				<div style="text-align: center; background-color: #B284BE;">
					<h1>JSP form</h1>
				</div>

				<span class="text-success"></span>
				<form action="data.jsp" method="post">

					<div class="form-group mb-3">
						<label class="form-label">First Name</label> <input type="text"
							name="fname" id="fname" class="form-control"
							onkeyup="validation()"> <span id="fnameE"
							class="text-danger"></span>
					</div>

					<div class="form-group mb-3">
						<label class="form-label">Last Name</label> <input type="text"
							name="lname" id="lname" class="form-control"
							onkeyup="validation()"> <span id="lnameE"
							class="text-danger"></span>
					</div>

					<div class="form-group mb-3">
						<label class="form-label">Email</label> <input type="text"
							name="email" id="email" class="form-control"
							onkeyup="validation()"> <span id="emailE"
							class="text-danger"></span>
					</div>

					<div class="form-group mb-3">
						<label class="form-label">Mobile</label> <input type="text"
							name="phno" id="phno" class="form-control" onkeyup="validation()">
						<span id="phnoE" class="text-danger"></span>
					</div>

					<div class="form-group mb-3">
						<label class="form-label">Password</label> <input type="password"
							name="pass" id="pass" class="form-control" onkeyup="validation()">
						<span id="passE" class="text-danger"></span>
					</div>

					<div class="form-group mb-3">
						<label class="form-label">Conform Password</label> <input
							type="password" name="cpass" id="cpass" class="form-control"
							onkeyup="validation()"> <span id="cpassE"
							class="text-danger"></span>
					</div>

					<button type="submit" class="btn btn-primary btn-lg" id="sbtn">Submit</button>
					<button type="reset" class="btn btn-success btn-lg" id="rbtn">Reset</button>
				</form>

			</div>
		</div>
	</div>

</body>
</html>