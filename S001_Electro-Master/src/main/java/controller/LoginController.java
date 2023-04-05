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

@WebServlet("/login")
public class LoginController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String fname = request.getParameter("fname");
		System.out.println(fname);
		User us = new User();
		us.setEmail(email);
		us.setPass(pass);

		UserDao dao = new UserDao();
		boolean b = dao.logincheck(us);

		if (b) {
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			session.setAttribute("fname", fname);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "Invalid email or password");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
