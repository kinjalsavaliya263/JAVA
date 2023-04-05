package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.MailOtpSend;
import model.User;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String pass = request.getParameter("pass");

		User us = new User();
		us.setEmail(email);
		us.setPass(pass);

		UserDao dao = new UserDao();
		boolean b = dao.logincheck(us);

		// For mail sending....

		Random rd = new Random();
		int otp = rd.nextInt(999999);
		System.out.println(otp);
		

		MailOtpSend.send(email, otp + "");
		
		ServletContext cx = request.getServletContext();
		cx.setAttribute("otp", otp + "");

		if (b) {
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			request.getRequestDispatcher("verify.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "Invalid email or password");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
