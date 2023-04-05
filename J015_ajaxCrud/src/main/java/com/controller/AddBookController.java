package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.BookDao;
import com.model.Book;

/**
 * Servlet implementation class AddBookController
 */
@WebServlet("/addbook")
public class AddBookController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String bname = request.getParameter("bname");
		String price = request.getParameter("price");
		String qty = request.getParameter("qty");

		Book b = new Book();
		b.setBname(bname);
		b.setPrice(Double.parseDouble(price));
		b.setQty(Integer.parseInt(qty));

		BookDao d = new BookDao();
		int i = d.addBook(b);

		PrintWriter pw = response.getWriter();
		if (i > 0) {
			pw.write("Book inserted successfully !!!");
		}

	}

}
