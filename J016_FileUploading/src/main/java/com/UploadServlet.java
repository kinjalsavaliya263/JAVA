package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/upload")
@MultipartConfig
public class UploadServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("uname");
		Part file = request.getPart("file");
		String filename = Paths.get(file.getSubmittedFileName()).getFileName().toString();

//		String uploadpath = "D:\\tops Eclipse\\J016_FileUploading\\src\\main\\webapp\\img";

		String path = request.getServletContext().getRealPath("");
		String uploadpath = path + File.separator + "img";

		File f = new File(uploadpath);
		if (!f.exists()) {
			f.mkdir();
			System.out.println("folder created .....");
		}
		file.write(uploadpath + File.separator + filename);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practices?user=root");
			PreparedStatement ps = cn.prepareStatement("insert into upload values(?,?,?)");

			ps.setInt(1, 0);
			ps.setString(2, uname);
			ps.setString(3, filename);

			int i = ps.executeUpdate();
			if (i > 0) {
				request.getRequestDispatcher("index.jsp").forward(request, response);

			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
