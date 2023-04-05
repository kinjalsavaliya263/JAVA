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

@WebServlet("/changepass")
public class ChangePassController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");

		String opass = request.getParameter("opass");
		String pass = request.getParameter("pass");
		String cpass = request.getParameter("cpass");
		System.out.println("opass= " + opass + "pass = " + pass + "cpass = " + cpass);

		UserDao dao = new UserDao();

		User us = dao.getByEmail(email);
		System.out.println("change pass opass= " + us.getPass());

		if (opass.equals(us.getPass())) {
			if (cpass.equals(pass)) {

				User us1 = new User();
				us1.setEmail(email);
				us1.setPass(pass);
				us1.setCpass(cpass);
				int i = dao.updatepass(us1);
				System.out.println("upc : i =" + i);
				if (i > 0) {
					request.setAttribute("msg1", "change password successfully done");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "confirm password should be same as a password");
				request.getRequestDispatcher("changepass.jsp").forward(request, response);
			}

		} else {
			request.setAttribute("msg", "Old password is not correct");
			request.getRequestDispatcher("changepass.jsp").forward(request, response);
		}
	}

}
