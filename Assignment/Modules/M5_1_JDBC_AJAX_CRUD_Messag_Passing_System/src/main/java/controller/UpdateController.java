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
public class UpdateController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("usid"));
		System.out.println(id);

		UserDao dao = new UserDao();
		User us = dao.getById(id);


		request.setAttribute("use", us);
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String phno = req.getParameter("phno");
		String pass = req.getParameter("pass");
//		System.out.println(id);

//		System.out.println(id + " " + fname + " " + lname + " " + email + " " + phno + " " + pass);

		User us = new User();
		us.setUid(id);
		us.setFname(fname);
		us.setLname(lname);
		us.setEmail(email);
		us.setPhno(phno);
		us.setPass(pass);

		UserDao dao = new UserDao();
		int i = dao.update(us);
		if (i > 0) {
			req.setAttribute("use", new User());
			req.setAttribute("msg", "update successfully done");
			req.getRequestDispatcher("update.jsp").forward(req, resp);
		}
	}



}
