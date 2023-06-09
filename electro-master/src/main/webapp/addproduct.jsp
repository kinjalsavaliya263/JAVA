<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="sellerheader.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Electro -Ecommerce</title>

</head>
<body>
	<!-- BREADCRUMB -->
	<div id="breadcrumb" class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
				<div class="col-md-12">
					<h3 class="breadcrumb-header">Add Products</h3>
					<ul class="breadcrumb-tree">
						<li><a href="#">Home</a></li>
						<li class="active">Add Products</li>
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
					<!-- Add Product -->
					<form method="post" action="ProductController"
						enctype="multipart/form-data">
						<div class="billing-details">
							<span class="text-danger">${msg}</span> <span
								class="text-success">${msg1}</span>
							<div class="section-title">
								<h3 class="title">Add Product Form</h3>
							</div>


							<input type="hidden" name="uid" id="uid" value="<%=us.getUid()%>">
							<input type="hidden" name="pid" id="pid">

							<!-- <div class="form-group"> -->
								<!-- <input class="input" type="text" name="category"
									placeholder="Category" id="category"> -->
								<select class="form-group input" name="category" aria-label="Default select example">
									<option selected>Select Category</option>
									<option value="laptop">Laptop</option>
									<option value="smartphone">Smartphone</option>
									<option value="camera">Camera</option>
									<option value="accessories">Accessories</option>
								</select>
							<!-- </div> -->
							<div class="form-group">
								<input class="input" type="text" name="pname"
									placeholder="Product Name" id="pname">
							</div>
							<div class="form-group">
								<input class="input" type="number" name="price"
									placeholder="Price" id="price">
							</div>
							<div class="form-group">
								<input class="input" type="number" name="oldprice"
									placeholder="Old Price" id="oldprice">
							</div>
							<div class="form-group">
								<input class="input" type="text" name="color"
									placeholder="Color" id="color">
							</div>

							<div class="form-group">
								<textarea cols="3" class="input" name="details"
									placeholder="Product Details" id="details"></textarea>
							</div>
							<div class="form-group">
								<textarea cols="3" class="input" name="inbox"
									placeholder="In Box" id="inbox"></textarea>
							</div>
							<div class="form-group">

								<input class="form-control" type="file" id="image" name="image">
							</div>

							<div class="form-group">
								<button type="submit" name="action" value="addproduct"
									class="primary-btn order-submit">Add Product</button>
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