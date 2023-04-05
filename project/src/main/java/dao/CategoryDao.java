
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Category;

public class CategoryDao {

	Connection cn = null;

	public CategoryDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practices?user=root");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int addCategory(Category ca) {

		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("insert into category values(?,?)");
			ps.setInt(1, 0);
			ps.setString(2, ca.getName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public ArrayList<Category> getallCategories() {
		ArrayList<Category> al = new ArrayList();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from category");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Category ca = new Category();
				ca.setCid(rs.getInt(1));
				ca.setName(rs.getString(2));

				al.add(ca);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}

}
