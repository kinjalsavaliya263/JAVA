<%@page import="java.util.List"%>
<%@page import="model.wishlist"%>
<%@page import="dao.WishlistDao"%>
<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Google font -->

</head>
<body>


	<!-- SECTION -->
	<div class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">

				<!-- section title -->
				<div class="col-md-12">
					<div class="section-title">
						<h3 class="title">My Wishlist</h3>

					</div>
				</div>
				<!-- /section title -->

				<!-- Products tab & slick -->
				<div class="col-md-12">
					<div class="row">
						<div class="products-tabs">
							<!-- tab -->
							<div id="tab1" class="tab-pane active">
								<div class="products-slick" data-nav="#slick-nav-1">

									<%
									WishlistDao dao = new WishlistDao();
									List<wishlist> pr = dao.getWishlistByUser(us.getUid());
									for (wishlist w : pr) {
										ProductDao pdao = new ProductDao();
										Product p = pdao.getById(w.getPid());
									%>

									<!-- product -->
									<div class="product">
										<div class="product-img">
											<img src="./images/<%=p.getImage()%>" height="250px">

										</div>
										<div class="product-body">
											<p class="product-category"><%=p.getCategory()%></p>
											<h3 class="product-name">
												<a href="product.jsp?pid=<%=p.getPid()%>"
													style="height: 100px; overflow: hidden; display: block; text-overflow: ellipsis;"><%=p.getPname()%></a>
											</h3>
											<h4 class="product-price">
												<%=p.getPrice()%>
												<del class="product-old-price"><%=p.getOldprice()%></del>
											</h4>
											<div class="product-rating">
												<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i>
											</div>
											<div>
												<a href="" class="primary-btn order-submit">Delete</a>
											</div>

										</div>
										<div class="add-to-cart">
											<button class="add-to-cart-btn">
												<a href="addcart.jsp"><i class="fa fa-shopping-cart"></i>
													add to cart</a>

											</button>
										</div>
									</div>
									<!-- /product -->
									<%
									}
									%>


								</div>
								<div id="slick-nav-1" class="products-slick-nav"></div>
							</div>
							<!-- /tab -->
						</div>
					</div>
				</div>
				<!-- Products tab & slick -->
			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	<!-- /SECTION -->





	<%@include file="footer.jsp"%>

</body>
</html>