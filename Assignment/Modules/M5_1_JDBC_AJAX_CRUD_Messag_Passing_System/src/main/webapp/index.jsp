<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!-- 
    1. Write a Java dynamic application “Message Passing System “using MVC and JDBC.
		User:
			Int uid ;( primary key, auto increment)
			String fname, lname, email, mobile; 
			Message:
			Int uid;
			String from, to, msg;
				👍 *-> Create one registration form to register user.
				👍 *-> Do client and server side validation.
				👍*-> Use AJAX to register with unique email id.
				👍*-> After successful registration confirmation email should be sent to
					user’s email id with one OTP.
				👍*-> Verify OTP and then and then allowed to login to the user.
				*-> After successful login user can edit their profile.
				*-> Also one user can send some msg to another user using their email id.
				*-> When another user logged in they are able to see msg sent
					by a particular user and also can reply.
				*-> Logout button is there to invalidate session.
				*-> Also take care when user logged out and press back button on 
					browser then it should be in logged out mode.
     -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Message Passing System</title>
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
	
	<script type="text/javascript">
	
	function validation() {
		
		var fname=document.getElementById("fname").value;
		var lname=document.getElementById("lname").value;
		var email=document.getElementById("email").value;
		var phno=document.getElementById("phno").value;
		var pass=document.getElementById("pass").value;
		var cpass=document.getElementById("cpass").value;
		var fnameE=document.getElementById("fnameE");
		var lnameE=document.getElementById("lnameE");
		var emailE=document.getElementById("emailE");
		var phnoE=document.getElementById("phnoE");
		var passE=document.getElementById("passE");
		var cpassE=document.getElementById("cpassE");
		var sbtn=document.getElementById("sbtn");
		
		
		var emailExp = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/

		var phnoExp = /^\d{10}$/;
		
		var passExp = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
		
		
		
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
		}else {
			lnameE.innerHTML = ""
			sbtn.disabled = false;

		}

		if (email == "" || email == null) {
			emailE.innerHTML = "Email should not be blank"
			sbtn.disabled = true;
			return;
		} else if (!emailExp.test(email)) {
			emailE.innerHTML = "Invalid email format"
			sbtn.disabled = true;
			return;
		} else {
			emailE.innerHTML = ""
			sbtn.disabled = false;
		}
		
		if (pass == "" || pass == null) {
			passE.innerHTML = "Password should not be blank"
			sbtn.disabled = true;
			return;
		} else if (!passExp.test(pass)) {
			passE.innerHTML = "Invalid password	"
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
			return false;

		}
	}
	
	
	</script>
	
	
</head>
<body>
	<div class="container">
		<div class="row justify-content-center my-3">
			<div class="col-lg-6 m-auto ">

				<h1 style="text-align: center; background-color: #8080FF;color: #E6FFEA" class="py-2">Registration Form</h1>

				<span class="text-success">${msg}</span>

				<form action="reg" method="post">
					<div class="form-group mb-3">
						<label><h4>First Name :</h4></label>
						<input type="text" name="fname" id="fname"class="form-control" onkeyup="validation()">
						<span id="fnameE" class="text-danger"></span>
					</div>
					
					<div class="form-group mb-3">
						<label><h4>Last Name :</h4></label>
						<input type="text" name="lname" id="lname"class="form-control" onkeyup="validation()">
						<span id="lnameE" class="text-danger"></span>
					</div>
					
					<div class="form-group mb-3">
						<label><h4>Email :</h4></label>
						<input type="text" name="email" id="email"class="form-control" onkeyup="validation()">
						<span id="emailE" class="text-danger"></span>
					</div>
					
					<div class="form-group mb-3">
						<label><h4>Phone No. :</h4></label>
						<input type="text" name="phno" id="phno"class="form-control" onkeyup="validation()">
						<span id="phnoE" class="text-danger"></span>
					</div>
					
					<div class="form-group mb-3">
						<label><h4>Password :</h4></label>
						<input type="password" name="pass" id="pass"class="form-control" onkeyup="validation()">
						<span id="passE" class="text-danger"></span>
					</div>
					
					<div class="form-group mb-3">
						<label><h4>Conform Password :</h4></label>
						<input type="password" name="cpass" id="cpass"class="form-control" onkeyup="validation()">
						<span id="cpassE" class="text-danger"></span>
					</div>
					
					<div class="d-grid gap-2 col-6 mx-auto">
					<button type="submit" class="btn btn-primary btn-lg" id="sbtn">Registration</button>
					</div>
					<div class="my-4"><h6>Already a user? <a href="login.jsp">LogIn</a></h6></div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>