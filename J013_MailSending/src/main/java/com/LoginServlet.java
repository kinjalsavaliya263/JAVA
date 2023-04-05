package com;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");

		Random rd = new Random();
		int otp = rd.nextInt(999);

		System.out.println(otp);
		MailSend.send(uname, otp + "");

		ServletContext cx = request.getServletContext();
		cx.setAttribute("otp", otp + "");

		request.getRequestDispatcher("verify.jsp").forward(request, response);
	}

}
