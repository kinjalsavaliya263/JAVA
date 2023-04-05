package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.User;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		User us = new User();
		us.setEmail(email);

		UserDao dao = new UserDao();
		User use = dao.getByEmail(email);
		String useremail = use.getEmail();
		String usertype = use.getUsertype();
		String user = "seller";

		if (email.equals(useremail)) {
			HttpSession session = req.getSession();
			session.setAttribute("email", email);
			req.setAttribute("use", use);
			if (usertype.equals(user)) {
				req.getRequestDispatcher("sellerindex.jsp").forward(req, resp);
			} else {
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
		} else {
			req.setAttribute("msg", "Invalid email or password");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String pass = request.getParameter("pass");

//		String fname = request.getParameter("fname");
		User us = new User();
		us.setEmail(email);
		us.setPass(pass);

		UserDao dao = new UserDao();
		boolean b = dao.logincheck(us);
		User use = dao.getByEmail(email);

		String usertype = use.getUsertype();
		String user = "seller";

//		System.out.println("user use = " + use.getUsertype());
//		System.out.println("usertype = " + usertype);
//		System.out.println("user = " + user);

		if (b) {

			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			request.setAttribute("use", use);
			if (usertype.equals(user)) {
				request.getRequestDispatcher("sellerindex.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}

		} else {
			request.setAttribute("msg", "Invalid email or password");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
