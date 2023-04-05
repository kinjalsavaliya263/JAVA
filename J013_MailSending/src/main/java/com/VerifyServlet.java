package com;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VerifyServlet
 */
@WebServlet("/verify")
public class VerifyServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String otp = request.getParameter("otp");

		ServletContext cx = request.getServletContext();
		String realotp = (String) cx.getAttribute("otp");

		if (otp.equals(realotp)) {
			request.getRequestDispatcher("home.jsp").forward(request, response);

		} else {
			request.setAttribute("err", "Invalid otp");
			request.getRequestDispatcher("verify.jsp").forward(request, response);

		}

	}

}
