/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-03-16 07:19:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.User;

public final class resetpass_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1678719194968L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1678951105600L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.User");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Electro - HTML Ecommerce</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Slick -->\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\" />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\" />\r\n");
      out.write("\r\n");
      out.write("<!-- nouislider -->\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Font Awesome Icon -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom stlylesheet -->\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("		  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("		  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("		<![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- HEADER -->\r\n");
      out.write("	<header>\r\n");
      out.write("		<!-- TOP HEADER -->\r\n");
      out.write("		<div id=\"top-header\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("				");

				/* String email = (String) session.getAttribute("email"); */
				User us = (User) request.getAttribute("use");
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<ul class=\"header-links pull-left\">\r\n");
      out.write("					<li><a href=\"#\"><i class=\"fa fa-phone\"></i> +021-95-51-84</a></li>\r\n");
      out.write("					<li><a href=\"#\"><i class=\"fa fa-envelope-o\"></i>\r\n");
      out.write("							email@email.com</a></li>\r\n");
      out.write("					<li><a href=\"#\"><i class=\"fa fa-map-marker\"></i> 1734\r\n");
      out.write("							Stonecoal Road</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<ul class=\"header-links pull-right\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<li><a href=\"contact.jsp\"><i class=\"fa fa-id-badge\"></i>Contact</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					");

					if (us != null) {
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<li style=\"color: white;\"><b>Welcome ");
      out.print(us.getFname());
      out.write(' ');
      out.print(us.getLname() );
      out.write("</b></li>\r\n");
      out.write("					<li><a href=\"logout.jsp\"><i class=\"fa fa-user\"></i>Logout</a></li>\r\n");
      out.write("					");

					} else {
					
      out.write("\r\n");
      out.write("					<li><a href=\"registration.jsp\"><i\r\n");
      out.write("							class=\"fa fa-address-card\"></i> Registration </a></li>\r\n");
      out.write("					<li><a href=\"login.jsp\"><i class=\"fa fa-user\"></i> login</a></li>\r\n");
      out.write("					");

					}
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- /TOP HEADER -->\r\n");
      out.write("\r\n");
      out.write("		<!-- MAIN HEADER -->\r\n");
      out.write("		<div id=\"header\">\r\n");
      out.write("			<!-- container -->\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<!-- row -->\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<!-- LOGO -->\r\n");
      out.write("					<div class=\"col-md-3\">\r\n");
      out.write("						<div class=\"header-logo\">\r\n");
      out.write("							<a href=\"#\" class=\"logo\"> <img src=\"./img/logo.png\" alt=\"\">\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- /LOGO -->\r\n");
      out.write("\r\n");
      out.write("					<!-- SEARCH BAR -->\r\n");
      out.write("					<div class=\"col-md-6\">\r\n");
      out.write("						<div class=\"header-search\">\r\n");
      out.write("							<form>\r\n");
      out.write("								<select class=\"input-select\">\r\n");
      out.write("									<option value=\"0\">All Categories</option>\r\n");
      out.write("									<option value=\"1\">Category 01</option>\r\n");
      out.write("									<option value=\"1\">Category 02</option>\r\n");
      out.write("								</select> <input class=\"input\" placeholder=\"Search here\">\r\n");
      out.write("								<button class=\"search-btn\">Search</button>\r\n");
      out.write("							</form>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- /SEARCH BAR -->\r\n");
      out.write("\r\n");
      out.write("					<!-- ACCOUNT -->\r\n");
      out.write("					<div class=\"col-md-3 clearfix\">\r\n");
      out.write("						<div class=\"header-ctn\">\r\n");
      out.write("							<!-- Wishlist -->\r\n");
      out.write("							<div>\r\n");
      out.write("								<a href=\"#\"> <i class=\"fa fa-heart-o\"></i> <span>Your\r\n");
      out.write("										Wishlist</span>\r\n");
      out.write("									<div class=\"qty\">2</div>\r\n");
      out.write("								</a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<!-- /Wishlist -->\r\n");
      out.write("\r\n");
      out.write("							<!-- Cart -->\r\n");
      out.write("							<div class=\"dropdown\">\r\n");
      out.write("								<a class=\"dropdown-toggle\" data-toggle=\"dropdown\"\r\n");
      out.write("									aria-expanded=\"true\"> <i class=\"fa fa-shopping-cart\"></i> <span>Your\r\n");
      out.write("										Cart</span>\r\n");
      out.write("									<div class=\"qty\">3</div>\r\n");
      out.write("								</a>\r\n");
      out.write("								<div class=\"cart-dropdown\">\r\n");
      out.write("									<div class=\"cart-list\">\r\n");
      out.write("										<div class=\"product-widget\">\r\n");
      out.write("											<div class=\"product-img\">\r\n");
      out.write("												<img src=\"./img/product01.png\" alt=\"\">\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"product-body\">\r\n");
      out.write("												<h3 class=\"product-name\">\r\n");
      out.write("													<a href=\"#\">product name goes here</a>\r\n");
      out.write("												</h3>\r\n");
      out.write("												<h4 class=\"product-price\">\r\n");
      out.write("													<span class=\"qty\">1x</span>$980.00\r\n");
      out.write("												</h4>\r\n");
      out.write("											</div>\r\n");
      out.write("											<button class=\"delete\">\r\n");
      out.write("												<i class=\"fa fa-close\"></i>\r\n");
      out.write("											</button>\r\n");
      out.write("										</div>\r\n");
      out.write("\r\n");
      out.write("										<div class=\"product-widget\">\r\n");
      out.write("											<div class=\"product-img\">\r\n");
      out.write("												<img src=\"./img/product02.png\" alt=\"\">\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"product-body\">\r\n");
      out.write("												<h3 class=\"product-name\">\r\n");
      out.write("													<a href=\"#\">product name goes here</a>\r\n");
      out.write("												</h3>\r\n");
      out.write("												<h4 class=\"product-price\">\r\n");
      out.write("													<span class=\"qty\">3x</span>$980.00\r\n");
      out.write("												</h4>\r\n");
      out.write("											</div>\r\n");
      out.write("											<button class=\"delete\">\r\n");
      out.write("												<i class=\"fa fa-close\"></i>\r\n");
      out.write("											</button>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"cart-summary\">\r\n");
      out.write("										<small>3 Item(s) selected</small>\r\n");
      out.write("										<h5>SUBTOTAL: $2940.00</h5>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"cart-btns\">\r\n");
      out.write("										<a href=\"#\">View Cart</a> <a href=\"#\">Checkout <i\r\n");
      out.write("											class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<!-- /Cart -->\r\n");
      out.write("\r\n");
      out.write("							<!-- Menu Toogle -->\r\n");
      out.write("							<div class=\"menu-toggle\">\r\n");
      out.write("								<a href=\"#\"> <i class=\"fa fa-bars\"></i> <span>Menu</span>\r\n");
      out.write("								</a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<!-- /Menu Toogle -->\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- /ACCOUNT -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- row -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- container -->\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- /MAIN HEADER -->\r\n");
      out.write("	</header>\r\n");
      out.write("	<!-- /HEADER -->\r\n");
      out.write("\r\n");
      out.write("	<!-- NAVIGATION -->\r\n");
      out.write("	<nav id=\"navigation\">\r\n");
      out.write("		<!-- container -->\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<!-- responsive-nav -->\r\n");
      out.write("			<div id=\"responsive-nav\">\r\n");
      out.write("				<!-- NAV -->\r\n");
      out.write("				<ul class=\"main-nav nav navbar-nav\">\r\n");
      out.write("					<li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("					<li><a href=\"#\">Hot Deals</a></li>\r\n");
      out.write("					<li><a href=\"#\">Categories</a></li>\r\n");
      out.write("					<li><a href=\"#\">Laptops</a></li>\r\n");
      out.write("					<li><a href=\"#\">Smartphones</a></li>\r\n");
      out.write("					<li><a href=\"#\">Cameras</a></li>\r\n");
      out.write("					<li><a href=\"#\">Accessories</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<!-- /NAV -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /responsive-nav -->\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- /container -->\r\n");
      out.write("	</nav>\r\n");
      out.write("	<!-- /NAVIGATION -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("\r\n");
      out.write("<title>Electro - HTML Ecommerce Template</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- BREADCRUMB -->\r\n");
      out.write("	<div id=\"breadcrumb\" class=\"section\">\r\n");
      out.write("		<!-- container -->\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<!-- row -->\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-md-12\">\r\n");
      out.write("					<h3 class=\"breadcrumb-header\">Reset Password</h3>\r\n");
      out.write("					<ul class=\"breadcrumb-tree\">\r\n");
      out.write("						<li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("						<li class=\"active\">Reset Password</li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /row -->\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- /container -->\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- /BREADCRUMB -->\r\n");
      out.write("\r\n");
      out.write("	<!-- SECTION -->\r\n");
      out.write("	<div class=\"section\">\r\n");
      out.write("		<!-- container -->\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<!-- row -->\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("				<div class=\"col-md-7\">\r\n");
      out.write("					<!-- Reset password -->\r\n");
      out.write("					<form action=\"resetpass\" method=\"post\">\r\n");
      out.write("						<div class=\"billing-details\">\r\n");
      out.write("							<span class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("							<div class=\"section-title\">\r\n");
      out.write("								<h3 class=\"title\">Reset Password</h3>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<input class=\"input\" type=\"email\" name=\"email\"\r\n");
      out.write("									placeholder=\"Email\" id=\"email\">\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"form-group \">\r\n");
      out.write("								<button type=\"submit\" class=\"primary-btn order-submit\">Next</button>\r\n");
      out.write("								<a href=\"login.jsp\" class=\"pull-right\">Back to login ?</a>\r\n");
      out.write("							</div>\r\n");
      out.write("						\r\n");
      out.write("						</div>\r\n");
      out.write("					</form>\r\n");
      out.write("					<!-- /Reset password -->\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /row -->\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- /container -->\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- /SECTION -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- NEWSLETTER -->\r\n");
      out.write("	<div id=\"newsletter\" class=\"section\">\r\n");
      out.write("		<!-- container -->\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<!-- row -->\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-md-12\">\r\n");
      out.write("					<div class=\"newsletter\">\r\n");
      out.write("						<p>\r\n");
      out.write("							Sign Up for the <strong>NEWSLETTER</strong>\r\n");
      out.write("						</p>\r\n");
      out.write("						<form>\r\n");
      out.write("							<input class=\"input\" type=\"email\" placeholder=\"Enter Your Email\">\r\n");
      out.write("							<button class=\"newsletter-btn\">\r\n");
      out.write("								<i class=\"fa fa-envelope\"></i> Subscribe\r\n");
      out.write("							</button>\r\n");
      out.write("						</form>\r\n");
      out.write("						<ul class=\"newsletter-follow\">\r\n");
      out.write("							<li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("							<li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("							<li><a href=\"#\"><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("							<li><a href=\"#\"><i class=\"fa fa-pinterest\"></i></a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /row -->\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- /container -->\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- /NEWSLETTER -->\r\n");
      out.write("<!-- FOOTER -->\r\n");
      out.write("	<footer id=\"footer\">\r\n");
      out.write("		<!-- top footer -->\r\n");
      out.write("		<div class=\"section\">\r\n");
      out.write("			<!-- container -->\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<!-- row -->\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-md-3 col-xs-6\">\r\n");
      out.write("						<div class=\"footer\">\r\n");
      out.write("							<h3 class=\"footer-title\">About Us</h3>\r\n");
      out.write("							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,\r\n");
      out.write("								sed do eiusmod tempor incididunt ut.</p>\r\n");
      out.write("							<ul class=\"footer-links\">\r\n");
      out.write("								<li><a href=\"#\"><i class=\"fa fa-map-marker\"></i>1734\r\n");
      out.write("										Stonecoal Road</a></li>\r\n");
      out.write("								<li><a href=\"#\"><i class=\"fa fa-phone\"></i>+021-95-51-84</a></li>\r\n");
      out.write("								<li><a href=\"#\"><i class=\"fa fa-envelope-o\"></i>email@email.com</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-md-3 col-xs-6\">\r\n");
      out.write("						<div class=\"footer\">\r\n");
      out.write("							<h3 class=\"footer-title\">Categories</h3>\r\n");
      out.write("							<ul class=\"footer-links\">\r\n");
      out.write("								<li><a href=\"#\">Hot deals</a></li>\r\n");
      out.write("								<li><a href=\"#\">Laptops</a></li>\r\n");
      out.write("								<li><a href=\"#\">Smartphones</a></li>\r\n");
      out.write("								<li><a href=\"#\">Cameras</a></li>\r\n");
      out.write("								<li><a href=\"#\">Accessories</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"clearfix visible-xs\"></div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-md-3 col-xs-6\">\r\n");
      out.write("						<div class=\"footer\">\r\n");
      out.write("							<h3 class=\"footer-title\">Information</h3>\r\n");
      out.write("							<ul class=\"footer-links\">\r\n");
      out.write("								<li><a href=\"#\">About Us</a></li>\r\n");
      out.write("								<li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("								<li><a href=\"#\">Privacy Policy</a></li>\r\n");
      out.write("								<li><a href=\"#\">Orders and Returns</a></li>\r\n");
      out.write("								<li><a href=\"#\">Terms & Conditions</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-md-3 col-xs-6\">\r\n");
      out.write("						<div class=\"footer\">\r\n");
      out.write("							<h3 class=\"footer-title\">Service</h3>\r\n");
      out.write("							<ul class=\"footer-links\">\r\n");
      out.write("								<li><a href=\"#\">My Account</a></li>\r\n");
      out.write("								<li><a href=\"#\">View Cart</a></li>\r\n");
      out.write("								<li><a href=\"#\">Wishlist</a></li>\r\n");
      out.write("								<li><a href=\"#\">Track My Order</a></li>\r\n");
      out.write("								<li><a href=\"#\">Help</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- /row -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /container -->\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- /top footer -->\r\n");
      out.write("\r\n");
      out.write("		<!-- bottom footer -->\r\n");
      out.write("		<div id=\"bottom-footer\" class=\"section\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<!-- row -->\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-md-12 text-center\">\r\n");
      out.write("						<ul class=\"footer-payments\">\r\n");
      out.write("							<li><a href=\"#\"><i class=\"fa fa-cc-visa\"></i></a></li>\r\n");
      out.write("							<li><a href=\"#\"><i class=\"fa fa-credit-card\"></i></a></li>\r\n");
      out.write("							<li><a href=\"#\"><i class=\"fa fa-cc-paypal\"></i></a></li>\r\n");
      out.write("							<li><a href=\"#\"><i class=\"fa fa-cc-mastercard\"></i></a></li>\r\n");
      out.write("							<li><a href=\"#\"><i class=\"fa fa-cc-discover\"></i></a></li>\r\n");
      out.write("							<li><a href=\"#\"><i class=\"fa fa-cc-amex\"></i></a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("						<span class=\"copyright\"> <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("							Copyright &copy;<script>\r\n");
      out.write("								document.write(new Date().getFullYear());\r\n");
      out.write("							</script> All rights reserved | This template is made with <i\r\n");
      out.write("							class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a\r\n");
      out.write("							href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a> <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("						</span>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- /row -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /container -->\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- /bottom footer -->\r\n");
      out.write("	</footer>\r\n");
      out.write("	<!-- /FOOTER -->\r\n");
      out.write("\r\n");
      out.write("	<!-- jQuery Plugins -->\r\n");
      out.write("	<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("	<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("	<script src=\"js/slick.min.js\"></script>\r\n");
      out.write("	<script src=\"js/nouislider.min.js\"></script>\r\n");
      out.write("	<script src=\"js/jquery.zoom.min.js\"></script>\r\n");
      out.write("	<script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
