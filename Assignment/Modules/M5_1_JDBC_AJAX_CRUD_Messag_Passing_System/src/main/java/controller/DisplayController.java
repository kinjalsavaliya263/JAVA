package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import dao.UserDao;
import model.User;


@WebServlet("/display")
public class DisplayController extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		UserDao dao = new UserDao();

		ArrayList<User> vi = dao.viewData();

		req.setAttribute("data", vi);
		req.getRequestDispatcher("View.jsp").forward(req, res);
	}
}
