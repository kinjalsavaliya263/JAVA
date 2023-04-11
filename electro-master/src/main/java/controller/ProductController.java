package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.ProductDao;
import dao.UserDao;
import model.Product;
import model.User;

@WebServlet("/ProductController")
@MultipartConfig
public class ProductController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

//**************************************** for add product********************************************

		if (action.equalsIgnoreCase("addproduct")) {

			Part file = request.getPart("image");
			String filename = Paths.get(file.getSubmittedFileName()).getFileName().toString();

			String uploadpath = "D:\\tops Eclipse\\electro-master\\src\\main\\webapp\\images";

			File f = new File(uploadpath);
			if (!f.exists()) {
				f.mkdir();
				System.out.println("folder created .....");
			}
			file.write(uploadpath + File.separator + filename);

			Product p = new Product();
			p.setUid(Integer.parseInt(request.getParameter("uid")));
			p.setCategory(request.getParameter("category"));
			p.setPname(request.getParameter("pname"));
			p.setPrice(Double.parseDouble(request.getParameter("price")));
			p.setOldprice(Double.parseDouble(request.getParameter("oldprice")));
			p.setColor(request.getParameter("color"));
			p.setDetails(request.getParameter("details"));
			p.setInbox(request.getParameter("inbox"));
			p.setImage(filename);

			ProductDao dao = new ProductDao();
			int i = dao.addProduct(p);
			String email = request.getParameter("email");
			UserDao dao1 = new UserDao();
			User us = dao1.getByEmail(email);

			request.setAttribute("use", us);

			if (i > 0) {
				request.setAttribute("msg1", "Product Add Successfully.....");
				request.getRequestDispatcher("addproduct.jsp").forward(request, response);
			} else {
				request.setAttribute("msg", "Product Not Add.....");
				request.getRequestDispatcher("addproduct.jsp").forward(request, response);
			}

// **************************************** for view product********************************************
		} else if (action.equalsIgnoreCase("updateproduct")) {

			Part file = request.getPart("image");
			String filename = Paths.get(file.getSubmittedFileName()).getFileName().toString();

			String uploadpath = "D:\\tops Eclipse\\electro-master\\src\\main\\webapp\\images";

			File f = new File(uploadpath);
			if (!f.exists()) {
				f.mkdir();
				System.out.println("folder created .....");
			}
			file.write(uploadpath + File.separator + filename);

//			System.out.println("in product con");
			Product p = new Product();
			p.setPid(Integer.parseInt(request.getParameter("pid")));
			p.setUid(Integer.parseInt(request.getParameter("uid")));
			p.setCategory(request.getParameter("category"));
			p.setPname(request.getParameter("pname"));
			p.setPrice(Double.parseDouble(request.getParameter("price")));
			p.setOldprice(Double.parseDouble(request.getParameter("oldprice")));
			p.setColor(request.getParameter("color"));
			p.setDetails(request.getParameter("details"));
			p.setInbox(request.getParameter("inbox"));
			p.setImage(filename);

			ProductDao dao = new ProductDao();
			int i = dao.update(p);
//			System.out.println("i : " + i);
			if (i > 0) {
//				request.setAttribute("use", new Product());
				request.setAttribute("msg", "update successfully done");
				request.getRequestDispatcher("editproduct.jsp").forward(request, response);
			}
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String action = req.getParameter("action");
		if (action.equalsIgnoreCase("delete")) {

// **************************************** for delete product********************************************
			String email = req.getParameter("email");
			int id = Integer.parseInt(req.getParameter("did"));
			ProductDao dao = new ProductDao();
			int i = dao.delete(id);
			UserDao dao1 = new UserDao();
			User us = dao1.getByEmail(email);

			req.setAttribute("use", us);

			if (i > 0) {
				req.getRequestDispatcher("viewproduct.jsp").forward(req, resp);
			}
		}
	}
}
