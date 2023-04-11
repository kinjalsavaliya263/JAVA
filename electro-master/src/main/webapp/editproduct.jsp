<%@page import="dao.UserDao"%>
<%@page import="model.Product"%>
<%@page import="dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Electro -Ecommerce</title>

</head>
<body>
	<%
	String email = request.getParameter("email");
	UserDao dao1 = new UserDao();
	User us1 = dao1.getByEmail(email);
	request.setAttribute("use", us1);
	%>

	<%@ include file="sellerheader.jsp"%>
	<!-- BREADCRUMB -->
	<div id="breadcrumb" class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
				<div class="col-md-12">
					<h3 class="breadcrumb-header">Edit Products</h3>
					<ul class="breadcrumb-tree">
						<li><a href="#">Home</a></li>
						<li class="active">Edit Products</li>
					</ul>
				</div>
			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	<!-- /BREADCRUMB -->

	<%
	int pid = Integer.parseInt(request.getParameter("pid"));
	ProductDao dao = new ProductDao();
	Product p = dao.getById(pid);
	%>

	<!-- SECTION -->
	<div class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">

				<div class="col-md-7">
					<!-- Add Product -->
					<form method="post" action="ProductController"
						enctype="multipart/form-data">
						<div class="billing-details">
							<span class="text-danger">${msg}</span> <span
								class="text-success">${msg1}</span>
							<div class="section-title">
								<h3 class="title">Edit Product Form</h3>
							</div>

							<input type="hidden" name="pid" id="pid" value="<%=p.getPid()%>"> <input
								type="hidden" name="uid" id="uid" value="<%=p.getUid()%>">
							<select class="form-group input" name="category"
								aria-label="Default select example">
								<option selected><%=p.getCategory()%></option>
								<option value="laptop">Laptop</option>
								<option value="smartphone">Smartphone</option>
								<option value="camera">Camera</option>
								<option value="accessories">Accessories</option>
							</select>
							<!-- </div> -->
							<div class="form-group">
								<input class="input" type="text" name="pname"
									placeholder="Product Name" id="pname" value="<%=p.getPname()%>">
							</div>
							<div class="form-group">
								<input class="input" type="number" name="price"
									placeholder="Price" id="price" value="<%=p.getPrice()%>">
							</div>
							<div class="form-group">
								<input class="input" type="number" name="oldprice"
									placeholder="Old Price" id="oldprice"
									value="<%=p.getOldprice()%>">
							</div>
							<div class="form-group">
								<input class="input" type="text" name="color"
									placeholder="Color" id="color" value="<%=p.getColor()%>">
							</div>

							<div class="form-group">
								<textarea cols="3" class="input" name="details"
									placeholder="Product Details" id="details"><%=p.getDetails()%></textarea>
							</div>
							<div class="form-group">
								<textarea cols="3" class="input" name="inbox"
									placeholder="In Box" id="inbox"><%=p.getInbox()%></textarea>
							</div>
							<div class="form-group">
								<img alt="" src="images/<%=p.getImage()%>" height="150px"
									width="200px"> <input class="form-control" type="file"
									id="image" name="image">
							</div>

							<div class="form-group">
								<button type="submit" name="action" value="updateproduct"
									class="primary-btn order-submit">Edit Product</button>
							</div>

						</div>
					</form>
					<!-- /Add Product -->



				</div>


			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	<!-- /SECTION -->



</body>
</html>