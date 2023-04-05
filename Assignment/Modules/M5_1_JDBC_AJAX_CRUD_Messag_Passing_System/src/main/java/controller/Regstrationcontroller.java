package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;


@WebServlet("/reg")
public class Regstrationcontroller extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String phno = request.getParameter("phno");
		String pass = request.getParameter("pass");

		User us = new User();
		us.setFname(fname);
		us.setLname(lname);
		us.setEmail(email);
		us.setPhno(phno);
		us.setPass(pass);

		UserDao dao = new UserDao();
		int i = dao.addUser(us);
		if (i > 0) {
			request.setAttribute("msg", "Regstration successfully done.......");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
