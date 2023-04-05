package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Email;
import model.User;

public class UserDao {
	Connection cn = null;

	public UserDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practices?user=root");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int addUser(User us) {
		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("insert into user2 values(?,?,?,?,?,?)");

			ps.setInt(1, 0);
			ps.setString(2, us.getFname());
			ps.setString(3, us.getLname());
			ps.setString(4, us.getEmail());
			ps.setString(5, us.getPhno());
			ps.setString(6, us.getPass());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public ArrayList<User> viewData() {
		ArrayList<User> vi = new ArrayList();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from user2");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User us = new User();

				us.setUid(rs.getInt(1));
				us.setFname(rs.getString(2));
				us.setLname(rs.getString(3));
				us.setEmail(rs.getString(4));
				us.setPhno(rs.getString(5));
				us.setPass(rs.getString(6));

				vi.add(us);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vi;
	}

	public boolean logincheck(User us) {
		boolean b = false;

		try {
			PreparedStatement ps = cn.prepareStatement("select * from user2 where email=? and pass=?");

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

	public int delete(int id) {
		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("delete from user2 where uid=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	public User getById(int id) {

		User us = new User();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from user2 where uid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				us.setUid(rs.getInt(1));
				us.setFname(rs.getString(2));
				us.setLname(rs.getString(3));
				us.setEmail(rs.getString(4));
				us.setPhno(rs.getString(5));
				us.setPass(rs.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return us;
	}

	public int update(User us) {
		int i = 0;
		try {
			PreparedStatement ps = cn
					.prepareStatement("update user2 set fname=?,lname=?,email=?,phno=?,pass=? where uid=? ");

			ps.setInt(6, us.getUid());
			ps.setString(1, us.getFname());
			ps.setString(2, us.getLname());
			ps.setString(3, us.getEmail());
			ps.setString(4, us.getPhno());
			ps.setString(5, us.getPass());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	public User getByEmail(String email) {

		User us = new User();

		try {
			PreparedStatement ps = cn
					.prepareStatement("select * from user2 where uid in(select uid from user2 where email=?);");
			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				us.setUid(rs.getInt(1));
				us.setFname(rs.getString(2));
				us.setLname(rs.getString(3));
				us.setEmail(rs.getString(4));
				us.setPhno(rs.getString(5));
				us.setPass(rs.getString(6));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return us;
	}

	public int addEmail(Email em) {
		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("insert into email values(?,?,?,?,?,?)");

			ps.setInt(1, 0);
			ps.setString(2, em.getFrom1());
			ps.setString(3, em.getPass());
			ps.setString(4, em.getTo1());
			ps.setString(5, em.getSub());
			ps.setString(6, em.getMsg());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public Email getByTextEmail(String email) {

		Email em = new Email();

		try {
			PreparedStatement ps = cn
					.prepareStatement("select * from email where from1=? or to1=?");
			ps.setString(1, email);
			ps.setString(2, email);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				em.setEid(rs.getInt(1));
				em.setFrom1(rs.getString(2));
				em.setPass(rs.getString(3));
				em.setTo1(rs.getString(4));
				em.setSub(rs.getString(5));
				em.setMsg(rs.getString(6));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return em;
	}

	public int updateem(Email em) {
		int i = 0;
		try {
			PreparedStatement ps = cn
					.prepareStatement("update email set from1=?,pass=?,to1=?,sub=?,msg=? where eid=? ");

			ps.setInt(6, em.getEid());
			ps.setString(1, em.getFrom1());
			ps.setString(2, em.getPass());
			ps.setString(3, em.getTo1());
			ps.setString(4, em.getSub());
			ps.setString(5, em.getMsg());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	public ArrayList<Email> EmailviewData(String email) {
		ArrayList<Email> ei = new ArrayList();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from email where from1=? or to1=?");


			ps.setString(1, email);
			ps.setString(2, email);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Email em = new Email();

				em.setEid(rs.getInt(1));
				em.setFrom1(rs.getString(2));
				em.setPass(rs.getString(3));
				em.setTo1(rs.getString(4));
				em.setSub(rs.getString(5));
				em.setMsg(rs.getString(6));

				ei.add(em);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ei;
	}

}
