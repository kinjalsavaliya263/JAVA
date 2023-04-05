package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

@WebServlet("/update")
public class Updatecontroller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int uid = Integer.parseInt(request.getParameter("uid"));
		String action = request.getParameter("action");
		UserDao dao = new UserDao();
		if (action.equals("delete")) {
			dao.delete(uid);
			request.getRequestDispatcher("display").forward(request, response);
		} else if (action.equals("update")) {
			User u = dao.getById(uid);
			request.setAttribute("data", u);
			request.getRequestDispatcher("index.jsp").forward(request, response);

		}

	}

}