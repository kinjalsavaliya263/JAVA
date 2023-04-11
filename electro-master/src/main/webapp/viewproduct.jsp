<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="dao.ProductDao"%>
<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
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
					<h3 class="breadcrumb-header">View Products</h3>
					<ul class="breadcrumb-tree">
						<li><a href="#">Home</a></li>
						<li class="active">View Products</li>
					</ul>
				</div>
			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	<!-- /BREADCRUMB -->

	<!-- View Product -->

	<div class="">
		<div class="row justify-content-center my-3">
			<div class="col-lg-12 m-auto ">

				<table class="table table-success table-striped">
					<thead>
						<tr>
							<th scope="col">Product id</th>
							<th scope="col">Image</th>
							<th scope="col">Category</th>
							<th scope="col">Product Name</th>
							<th scope="col">Price</th>
							<th scope="col">Old Price</th>
							<th scope="col">Color</th>
							<th scope="col">Product Details</th>
							<th scope="col">In Box</th>
							<th scope="col" colspan="2">Action</th>
						</tr>
					</thead>

					<%
					ProductDao dao = new ProductDao();
					ArrayList<Product> pr = dao.viewproduct();
					for (Product p : pr) {
					%>

					<tbody>
						<tr>
							<th scope="row"><%=p.getPid()%></th>
							<td><img alt="" src="images/<%=p.getImage()%>"
								height="150px" width="200px"></td>
							<td><%=p.getCategory()%></td>
							<td><%=p.getPname()%></td>
							<td><%=p.getPrice()%></td>
							<td><%=p.getOldprice()%></td>
							<td><%=p.getColor()%></td>
							<td><%=p.getDetails()%></td>
							<td><%=p.getInbox()%></td>
							<td><button class="btn btn-danger">

									<a
										href="ProductController?did=<%=p.getPid()%>&email=<%=us.getEmail()%>&action=delete"
										style="text-decoration: none; color: white;">Delete</a>
								</button></td>
							<td><button class="btn btn-info">
									<a href="editproduct.jsp?pid=<%=p.getPid()%>&email=<%=us.getEmail() %>"
										style="text-decoration: none; color: white;">Update</a>
								</button></td>

						</tr>

					</tbody>

					<%
					}
					%>
				</table>

			</div>
		</div>
	</div>

	<!-- /View Product -->


</body>
</html>