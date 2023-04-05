package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

@WebServlet("/updateprofile")
public class UpdateprofileController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");

		UserDao dao = new UserDao();
		User us = dao.getByEmail(email);

		request.setAttribute("use", us);
		request.getRequestDispatcher("updateprofile.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String phno = request.getParameter("phno");
		String address = request.getParameter("address");

		User us = new User();
		us.setFname(fname);
		us.setLname(lname);
		us.setEmail(email);
		us.setPhno(phno);
		us.setAddress(address);

		UserDao dao = new UserDao();
		int i = dao.updateprofile(us);

		if (i > 0) {
			request.setAttribute("use", new User());
			request.setAttribute("email", email);
			request.setAttribute("msg", "Update profile successfully done...");
			request.getRequestDispatcher("myprofile?email=" + email + "").forward(request, response);
		}
	}

}
