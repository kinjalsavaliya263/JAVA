/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-04-06 11:57:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import dao.ProductDao;
import model.Product;
import java.util.ArrayList;
import model.User;

public final class viewproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/sellerheader.jsp", Long.valueOf(1680782042496L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.Product");
    _jspx_imports_classes.add("org.apache.jasper.tagplugins.jstl.core.ForEach");
    _jspx_imports_classes.add("model.User");
    _jspx_imports_classes.add("dao.ProductDao");
    _jspx_imports_classes.add("java.util.ArrayList");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Electro -Ecommerce</title>\r\n");
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
      out.write("					\r\n");
      out.write("				</ul>\r\n");
      out.write("				<ul class=\"header-links pull-right\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					");

					if (us != null) {
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<li><a href=\"myprofile?email=");
      out.print(us.getEmail());
      out.write("\"><i\r\n");
      out.write("							class=\"fa fa-user\"></i>My Profile</a></li>\r\n");
      out.write("					<li><a href=\"changepass.jsp?email=");
      out.print(us.getEmail());
      out.write("\"><i\r\n");
      out.write("							class=\"fa fa-key\"></i>Change Password</a></li>\r\n");
      out.write("					<li style=\"color: white;\"><b>Welcome ");
      out.print(us.getFname());
      out.write(' ');
      out.print(us.getLname());
      out.write("</b></li>\r\n");
      out.write("					<li><a href=\"logout.jsp\"><i class=\"fa fa-user\"></i>Logout</a></li>\r\n");
      out.write("					");

					} else {
					
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("							<!-- Add Product -->\r\n");
      out.write("							<div>\r\n");
      out.write("								<a href=\"addproduct?email=");
      out.print(us.getEmail());
      out.write("\"> <i class=\"fa fa-plus\"></i> <span>Add\r\n");
      out.write("										Product</span>\r\n");
      out.write("								</a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<!-- /Add Product -->\r\n");
      out.write("\r\n");
      out.write("							<!-- View Product -->\r\n");
      out.write("							<div >\r\n");
      out.write("								<a href=\"viewproduct?email=");
      out.print(us.getEmail());
      out.write("\"> <i class=\"fa fa-eye\"></i> <span>View\r\n");
      out.write("										Products</span>\r\n");
      out.write("								</a>\r\n");
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("							<!-- /View Product -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Electro -Ecommerce</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- BREADCRUMB -->\r\n");
      out.write("	<div id=\"breadcrumb\" class=\"section\">\r\n");
      out.write("		<!-- container -->\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<!-- row -->\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-md-12\">\r\n");
      out.write("					<h3 class=\"breadcrumb-header\">View Products</h3>\r\n");
      out.write("					<ul class=\"breadcrumb-tree\">\r\n");
      out.write("						<li><a href=\"#\">Home</a></li>\r\n");
      out.write("						<li class=\"active\">View Products</li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /row -->\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- /container -->\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- /BREADCRUMB -->\r\n");
      out.write("\r\n");
      out.write("	<!-- View Product -->\r\n");
      out.write("\r\n");
      out.write("	<div class=\"\">\r\n");
      out.write("		<div class=\"row justify-content-center my-3\">\r\n");
      out.write("			<div class=\"col-lg-12 m-auto \">\r\n");
      out.write("\r\n");
      out.write("				<table class=\"table table-success table-striped\">\r\n");
      out.write("					<thead>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th scope=\"col\">Product id</th>\r\n");
      out.write("							<th scope=\"col\">Image</th>\r\n");
      out.write("							<th scope=\"col\">Category</th>\r\n");
      out.write("							<th scope=\"col\">Product Name</th>\r\n");
      out.write("							<th scope=\"col\">Price</th>\r\n");
      out.write("							<th scope=\"col\">Old Price</th>\r\n");
      out.write("							<th scope=\"col\">Color</th>\r\n");
      out.write("							<th scope=\"col\">Product Details</th>\r\n");
      out.write("							<th scope=\"col\">In Box</th>\r\n");
      out.write("							<th scope=\"col\" colspan=\"2\">Action</th>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</thead>\r\n");
      out.write("\r\n");
      out.write("					");

					ProductDao dao = new ProductDao();
					ArrayList<Product> pr = dao.viewproduct();
					for (Product p : pr) {
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<tbody>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th scope=\"row\">");
      out.print(p.getPid());
      out.write("</th>\r\n");
      out.write("							<td><img alt=\"\" src=\"images/");
      out.print(p.getImage());
      out.write("\"\r\n");
      out.write("								height=\"150px\" width=\"200px\"></td>\r\n");
      out.write("							<td>");
      out.print(p.getCategory());
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(p.getPname());
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(p.getPrice());
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(p.getOldprice());
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(p.getColor());
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(p.getDetails());
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(p.getInbox());
      out.write("</td>\r\n");
      out.write("							<td><button class=\"btn btn-danger\">\r\n");
      out.write("\r\n");
      out.write("									<a\r\n");
      out.write("										href=\"ProductController?did=");
      out.print(p.getPid());
      out.write("&email=");
      out.print(us.getEmail());
      out.write("&action=delete\"\r\n");
      out.write("										style=\"text-decoration: none; color: white;\">Delete</a>\r\n");
      out.write("								</button></td>\r\n");
      out.write("							<td><button class=\"btn btn-info\">\r\n");
      out.write("									<a href=\"editproduct.jsp?pid=");
      out.print(p.getPid());
      out.write("&email=");
      out.print(us.getEmail() );
      out.write("\"\r\n");
      out.write("										style=\"text-decoration: none; color: white;\">Update</a>\r\n");
      out.write("								</button></td>\r\n");
      out.write("\r\n");
      out.write("						</tr>\r\n");
      out.write("\r\n");
      out.write("					</tbody>\r\n");
      out.write("\r\n");
      out.write("					");

					}
					
      out.write("\r\n");
      out.write("				</table>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- /View Product -->\r\n");
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
