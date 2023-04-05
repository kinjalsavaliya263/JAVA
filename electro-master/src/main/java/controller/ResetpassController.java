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

import model.MailOtpSend;

/**
 * Servlet implementation class ResetpassController
 */
@WebServlet("/resetpass")
public class ResetpassController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");

		Random rd = new Random();
		int otp = rd.nextInt(999999);
		System.out.println("send otp " + otp);

		MailOtpSend.send(email, otp + "");

		ServletContext cx = request.getServletContext();
		cx.setAttribute("otp", otp + "");

		HttpSession session = request.getSession();
		session.setAttribute("email", email);
		request.getRequestDispatcher("verifycode.jsp").forward(request, response);
	}

}
