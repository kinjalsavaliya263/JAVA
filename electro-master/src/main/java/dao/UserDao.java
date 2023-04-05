
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;

public class UserDao {

	Connection cn = null;

	public UserDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?user=root");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public int addUser(User us) {
		int i = 0;

		try {
//			System.out.println(" before  add user.......");
			PreparedStatement ps = cn.prepareStatement("insert into user1 values(?,?,?,?,?,?,?,?,?)");

			ps.setInt(1, 0);
			ps.setString(2, us.getFname());
			ps.setString(3, us.getLname());
			ps.setString(4, us.getEmail());
			ps.setString(5, us.getPhno());
			ps.setString(6, us.getPass());
			ps.setString(7, us.getCpass());
			ps.setString(8, us.getAddress());
			ps.setString(9, us.getUsertype());

			i = ps.executeUpdate();
//			System.out.println("After add user....");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	// for Registration Checking.......

	public boolean regcheck(User us) {
		boolean b = false;

		try {
//			System.out.println("reg check........");
			PreparedStatement ps = cn.prepareStatement("select * from user1 where email=?");
			ps.setString(1, us.getEmail());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				b = false;
			} else {
				b = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b;
	}
	// for log in checking.....

	public boolean logincheck(User us) {
		boolean b = false;

		try {
			PreparedStatement ps = cn.prepareStatement("select * from user1 where email=? and pass=?");
			ps.setString(1, us.getEmail());
			ps.setString(2, us.getPass());
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				b = true;
			} else {
				b = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	// for fname login check........

	public User getByEmail(String email) {

		User us = new User();

		try {
			PreparedStatement ps = cn
					.prepareStatement("select * from user1 where uid in(select uid from user1 where email=?);");
			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();
//			System.out.println("User dao get by email");
			if (rs.next()) {
				us.setUid(rs.getInt(1));
				us.setFname(rs.getString(2));
				us.setLname(rs.getString(3));
				us.setEmail(rs.getString(4));
				us.setPhno(rs.getString(5));
				us.setPass(rs.getString(6));
				us.setCpass(rs.getString(7));
				us.setAddress(rs.getString(8));
				us.setUsertype(rs.getString(9));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return us;
	}

	// for update password.....

	public int updatepass(User us) {
		int i = 0;

		try {
//			System.out.println("email= " + us.getEmail());
//			System.out.println("pass= " + us.getPass());
//			System.out.println("cpass= " + us.getCpass());
			PreparedStatement ps = cn.prepareStatement("update user1 set pass=? ,cpass=? where email=?");
			System.out.println("User dao updatepass");
			ps.setString(1, us.getPass());
			ps.setString(2, us.getCpass());
			ps.setString(3, us.getEmail());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	// for update profile.....

	public int updateprofile(User us) {
		int i = 0;

		try {
			PreparedStatement ps = cn
					.prepareStatement("update user1 set fname=?,lname=?,phno=?,address=? where email=?");

			ps.setString(1, us.getFname());
			ps.setString(2, us.getLname());
			ps.setString(3, us.getPhno());
			ps.setString(4, us.getAddress());
			ps.setString(5, us.getEmail());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return i;
	}

}
