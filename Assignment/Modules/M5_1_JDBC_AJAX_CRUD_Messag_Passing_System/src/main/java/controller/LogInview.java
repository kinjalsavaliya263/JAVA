package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import dao.UserDao;
import model.Email;
import model.User;


@WebServlet("/loginview")
public class LogInview extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");

//		String email = "kinjalsavaliya263@gmail.com";

		UserDao dao = new UserDao();
		User us = dao.getByEmail(email);

		ArrayList<Email> ei = dao.EmailviewData(email);

		req.setAttribute("edata", ei);
		req.setAttribute("use", us);
		req.getRequestDispatcher("loginview.jsp").forward(req, res);
	}

}
