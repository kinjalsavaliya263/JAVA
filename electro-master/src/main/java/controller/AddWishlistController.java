package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.WishlistDao;
import model.wishlist;

/**
 * Servlet implementation class MyprofileController
 */
@WebServlet("/addwishlist")
public class AddWishlistController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int pid = Integer.parseInt(req.getParameter("pid"));
		int uid = Integer.parseInt(req.getParameter("uid"));

		wishlist w = new wishlist();
		w.setPid(pid);
		w.setUid(uid);

		WishlistDao dao = new WishlistDao();
		dao.addWishlist(w);

//		req.setAttribute("w", w);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
