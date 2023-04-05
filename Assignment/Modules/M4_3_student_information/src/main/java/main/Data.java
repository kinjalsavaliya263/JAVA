package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Student;

/**
 * Servlet implementation class Data
 */
@WebServlet("/data")
public class Data extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	String fname=request.getParameter("fname");
	String lname=request.getParameter("lname");
	String email=request.getParameter("email");
	String mobile=request.getParameter("mono");
	String gender=request.getParameter("gender");
	String password=request.getParameter("pass");
	
		System.out.println(fname+" "+lname+" "+email+ " "+mobile+" "+gender+ " "+password);
		
		PrintWriter pw=response.getWriter();
		pw.write(fname+" "+lname+" "+email+ " "+mobile+" "+gender+ " "+password);
		
//		pw.write(lname);
//		pw.write(email);
//		pw.write(mobile);
//		pw.write(gender);
//		pw.write(password);
	
		
		

		
	}

	
	

}
