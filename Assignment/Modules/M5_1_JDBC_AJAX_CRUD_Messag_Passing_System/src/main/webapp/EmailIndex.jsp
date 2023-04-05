<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Email Send</title>
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
		
		var from1=document.getElementById("from1").value;
		var pass=document.getElementById("pass").value;
		var to1=document.getElementById("to1").value;
		var sub=document.getElementById("sub").value;
		var msg=document.getElementById("msg").value;
		
		
		var from1E=document.getElementById("from1E");
		var passE=document.getElementById("passE");
		var to1E=document.getElementById("to1E");
		var subE=document.getElementById("subE");
		var msgE=document.getElementById("msgE");
		var sbtn=document.getElementById("sbtn");
		
		
		var emailExp = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/

	
		
		
		
		if (from1 == "" || from1 == null) {
			from1E.innerHTML = "From Email should not be blank"
			sbtn.disabled = true;
			return;
		} else if (!emailExp.test(from1)) {
			from1E.innerHTML = "Invalid email format"
				sbtn.disabled = true;
				return;
		} else {
			from1E.innerHTML = ""
			sbtn.disabled = false;
		}

		if (pass == "" || pass == null) {
			passE.innerHTML = "Password should not be blank"
			sbtn.disabled = true;
			return;
		} else {
			passE.innerHTML = ""
			sbtn.disabled = false;
		}
		
		if (to1 == "" || to1 == null) {
			to1E.innerHTML = "To Email should not be blank"
			sbtn.disabled = true;
			return;
		} else if (!emailExp.test(to1)) {
			to1E.innerHTML = "Invalid email format"
			sbtn.disabled = true;
			return;
		} else {
			to1E.innerHTML = ""
			sbtn.disabled = false;
		}
		
	
		
		if (sub == "" || sub == null) {
			subE.innerHTML = "sub should not be blank"
			sbtn.disabled = true;
			return;
		} else {
			subE.innerHTML = ""
			sbtn.disabled = false;
		}
		

		if (msg == "" || msg == null) {
			msgE.innerHTML = "Msg should not be blank"
			sbtn.disabled = true;
			return;
		} else {
			msgE.innerHTML = ""
			sbtn.disabled = false;
		}
		
		
	}
	
	
	</script>
	
	
</head>
<body>
	<div class="container">
		<div class="row justify-content-center my-3">
			<div class="col-lg-6 m-auto ">
			
				<%
				
				String email = (String) session.getAttribute("email");
				
				%>

				<h1 style="text-align: center; background-color: #8080FF;color: #E6FFEA" class="py-2">Email Send</h1>
				
				<h5 style="color: gray;">
					Welcome
					<%=email%></h5>

				<span class="text-success">${msg}</span>

				<form action="sendemail?email=<%=email %>" method="post">
					<div class="form-group mb-3">
						<label><h4>From :</h4></label>
						<input type="text" name="from1" id="from1"class="form-control" onkeyup="validation()">
						<span id="from1E" class="text-danger"></span>
					</div>
					
					<div class="form-group mb-3">
						<label><h4>Password :</h4></label>
						<input type="password" name="pass" id="pass"class="form-control" onkeyup="validation()">
						<span id="passE" class="text-danger"></span>
					</div>
					
					<div class="form-group mb-3">
						<label><h4>to :</h4></label>
						<input type="text" name="to1" id="to1"class="form-control" onkeyup="validation()">
						<span id="to1E" class="text-danger"></span>
					</div>
					
					<div class="form-group mb-3">
						<label><h4>Sub :</h4></label>
						<input type="text" name="sub" id="sub"class="form-control" onkeyup="validation()">
						<span id="subE" class="text-danger"></span>
					</div>
					
					<div class="form-group mb-3">
						<label><h4>Msg :</h4></label>
						<textarea rows="5" name="msg" id="msg"class="form-control" onkeyup="validation()"></textarea>
						
						<span id="msgE" class="text-danger"></span>
					</div>
					
					
					
					<div class="d-grid gap-2 col-6 mx-auto">
					<button type="submit" class="btn btn-primary btn-lg" id="sbtn">Send</button>
					</div>
					
				</form>
			</div>
		</div>
	</div>
</body>
</html>