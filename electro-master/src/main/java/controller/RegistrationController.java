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
public class RegistrationController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		boolean p = false;

		String usertype = request.getParameter("usertype");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String phno = request.getParameter("phno");
		String pass = request.getParameter("pass");
		String cpass = request.getParameter("cpass");
		String address = request.getParameter("address");

//		System.out.println("pass=" + pass + " cpass=" + cpass);
		if (cpass.contentEquals(pass)) {
			p = true;
		} else {
			p = false;
		}

//		System.out.println("p = " + p);
		User us = new User();
		us.setFname(fname);
		us.setLname(lname);
		us.setEmail(email);
		us.setPhno(phno);
		us.setPass(pass);
		us.setCpass(cpass);
		us.setAddress(address);
		us.setUsertype(usertype);

		UserDao dao = new UserDao();
		boolean b = dao.regcheck(us);
//		System.out.println(b);

		if (b) {

			if (p) {

				int i = dao.addUser(us);
				if (i > 0) {
					request.setAttribute("msg1", "Registration successfully done.....");
					request.getRequestDispatcher("registration.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "confirm password should be same as a password.....");
				request.getRequestDispatcher("registration.jsp").forward(request, response);
			}
		} else {
			request.setAttribute("msg", "Email registered.....");
			request.getRequestDispatcher("registration.jsp").forward(request, response);
		}

	}

}
