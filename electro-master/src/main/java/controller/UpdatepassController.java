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

@WebServlet("/updatepass")
public class UpdatepassController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		String pass = request.getParameter("pass");
		String cpass = request.getParameter("cpass");
//		System.out.println("updatepasscontroller " + email);
//		System.out.println("updatepass con pass = " + pass + "cpass = " + cpass);

		UserDao dao = new UserDao();

		User us = dao.getByEmail(email);

		User us1 = new User();
		us1.setEmail(email);
		us1.setPass(pass);
		us1.setCpass(cpass);
		int i = dao.updatepass(us1);
//		System.out.println("upc : i =" + i);
		if (i > 0) {
			request.setAttribute("msg", "Update password successfully done");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
