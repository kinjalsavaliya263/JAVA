
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Contact;

public class ContactDao {

	Connection cn = null;

	public ContactDao() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?user=root");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int addContact(Contact co) {
		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("insert into contact values(?,?,?,?,?,?,?)");

			ps.setInt(1, 0);
			ps.setString(2, co.getFname());
			ps.setString(3, co.getLname());
			ps.setString(4, co.getEmail());
			ps.setString(5, co.getPhno());
			ps.setString(6, co.getReason());
			ps.setString(7, co.getComment());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}
}
