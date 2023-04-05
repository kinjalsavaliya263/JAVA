package controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

/**
 * Servlet implementation class VerifyController
 */
@WebServlet("/verify")
public class VerifyController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String otp = request.getParameter("otp");
		System.out.println(otp);

		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");

		User us = new User();
		us.setEmail(email);


		ServletContext cx = request.getServletContext();

		String realotp = (String) cx.getAttribute("otp");

		if (otp.equals(realotp)) {

			request.setAttribute("email", email);

			request.getRequestDispatcher("loginview?email=" + email + "").forward(request, response);

		} else {
			request.setAttribute("err", "Invalid otp....");
			request.getRequestDispatcher("verify.jsp").forward(request, response);

		}
	}

}
