package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContactDao;
import model.Contact;

@WebServlet("/contact")
public class AddContactController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String phno = request.getParameter("phno");
		String reason = request.getParameter("reason");
		String comment = request.getParameter("comment");

		Contact co = new Contact();
		co.setFname(fname);
		co.setLname(lname);
		co.setEmail(email);
		co.setPhno(phno);
		co.setReason(reason);
		co.setComment(comment);

		ContactDao dao = new ContactDao();
		int i = dao.addContact(co);

		if (i > 0) {
			request.setAttribute("msg1", "Contact successfully done......");
			request.getRequestDispatcher("contact.jsp").forward(request, response);
		}
	}

}
