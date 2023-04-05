<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>Registration form</title>


</head>


<body>
	<div class="container">
		<div class="row mt-3">
			<div class="col-lg-4 m-auto">
				<div style="text-align: center;">
					<h1>Registration form</h1>
				</div>
				<span class="text-success">${msg}</span>
				<form action="reg" method="post">
					<div class="form-group mb-3">
						<label>Firstname</label>
						<input type="text" name="fname" id="fname" class="form-control" <%if(request.getParameter("fname")!=null){%> value="<%=request.getParameter("fname")%>" <%}%>> 
						<span id="fnameE" class="text-danger">${fnameE}</span>
					</div>
					<div class="form-group mb-3">
						<label>Lastname</label> 
						<input type="text" name="lname" id="lname" class="form-control" <%if(request.getParameter("lname")!=null){%> value="<%=request.getParameter("lname")%>" <%}%>> 
						<span id="lnameE" class="text-danger">${lnameE}</span>
					</div>
					<div class="form-group mb-3">
						<label>Email</label> 
						<input type="text" name="email" id="email" class="form-control" <%if(request.getParameter("email")!=null){%> value="<%=request.getParameter("email")%>" <%}%> > 
						<span id="emailE" class="text-danger">${emailE}</span>
					</div>
					<div class="form-group mb-3">
						<label>Password</label> 
						<input type="text" name="pass" id="pass" class="form-control" <%if(request.getParameter("pass")!=null){%> value="<%=request.getParameter("pass")%>" <%}%>> 
						<span id="passE" class="text-danger">${passE}</span>
					</div>
					<div class="form-group mb-3">
						<label>confirm password</label> 
						<input type="text" name="cpass"	id="cpass" class="form-control" <%if(request.getParameter("cpass")!=null){%> value="<%=request.getParameter("cpass")%>" <%}%>> 
						<span id="cpassE" class="text-danger">${cpassE}</span>
					</div>
					<div class="form-group mb-3">
						<label>phno</label> 
						<input type="text" name="phno" id="phno" class="form-control" <%if(request.getParameter("phno")!=null){%> value="<%=request.getParameter("phno")%>" <%}%>> 
						<span id="phnoE" class="text-danger">${phnoE}</span>
					</div>
					<button type="submit" class="btn btn-primary btn-lg" id="sbtn">Submit</button>
					<button type="reset" class="btn btn-primary btn-lg">Reset</button>
				</form>


			</div>
		</div>
	</div>

</body>
</html>