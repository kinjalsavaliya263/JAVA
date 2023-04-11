
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.wishlist;

public class WishlistDao {
	Connection cn = null;

	public WishlistDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?user=root");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void addWishlist(wishlist w) {

		try {
			PreparedStatement ps = cn.prepareStatement("insert into wishlist values(?,?,?)");

			ps.setInt(1, 0);
			ps.setInt(2, w.getPid());
			ps.setInt(3, w.getUid());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<wishlist> getWishlistByUser(int uid) {

		List<wishlist> list = new ArrayList<>();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from wishlist where uid=?");
			ps.setInt(1, uid);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				wishlist w = new wishlist();
				w.setWid(rs.getInt("wid"));
				w.setPid(rs.getInt("pid"));
				w.setUid(rs.getInt("uid"));
				list.add(w);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
