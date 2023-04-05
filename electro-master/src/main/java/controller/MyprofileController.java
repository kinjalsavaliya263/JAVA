package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

/**
 * Servlet implementation class MyprofileController
 */
@WebServlet("/myprofile")
public class MyprofileController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");

		UserDao dao = new UserDao();
		User us = dao.getByEmail(email);

		req.setAttribute("use", us);
		req.getRequestDispatcher("myprofile.jsp").forward(req, resp);
	}
}
