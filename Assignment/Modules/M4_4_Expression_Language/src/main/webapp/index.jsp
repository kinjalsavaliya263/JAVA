<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

	<!--  4.Write above Java program and print fetched data on another jsp using 
			expression language. -->

	<form action="data.jsp">
		<div class="container">
			<div class="row align-items-center mt-6">
				<div class="col-lg-4 m-auto p-5">
					<div class="mb-3">
						<label class="form-label">First Name :</label> <input type="text"
							name="n1">
					</div>
					<div class="mb-3">
						<label class="form-label">Last Name :</label> <input type="text"
							name="n2">
					</div>
					<input type="submit" value="submit" class="btn btn-primary btn-lg">
				</div>
			</div>
		</div>
	</form>


</body>
</html>