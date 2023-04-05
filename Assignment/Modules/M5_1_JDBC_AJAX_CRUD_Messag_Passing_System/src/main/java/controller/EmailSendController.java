package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.Email;
import model.SendTextEmail;
import model.User;

/**
 * Servlet implementation class EmailSendController
 */
@WebServlet("/sendemail")
public class EmailSendController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String from1 = request.getParameter("from1");
		String pass = request.getParameter("pass");
		String to1 = request.getParameter("to1");
		String sub = request.getParameter("sub");
		String msg = request.getParameter("msg");

		Email em = new Email();
		em.setFrom1(from1);
		em.setPass(pass);
		em.setTo1(to1);
		em.setSub(sub);
		em.setMsg(msg);

		HttpSession session = request.getSession();
		String email = request.getParameter("email");


		SendTextEmail.send(from1, pass, to1, sub, msg);

		User us = new User();
		us.setEmail(email);

		UserDao dao = new UserDao();
		int i = dao.addEmail(em);
		if (i > 0) {
			request.setAttribute("msg", "Email send successfully done.......");
			request.setAttribute("email", email);
			request.getRequestDispatcher("loginview?email=" + email + "").forward(request, response);
		}
	}
}
