
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Product;

public class ProductDao {

	Connection cn = null;

	public ProductDao() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?user=root");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//**************************************** for add product********************************************
	public int addProduct(Product p) {
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("insert into product values(?,?,?,?,?,?,?,?,?,?)");

			ps.setInt(1, 0);
			ps.setInt(2, p.getUid());
			ps.setString(3, p.getCategory());
			ps.setString(4, p.getPname());
			ps.setDouble(5, p.getPrice());
			ps.setDouble(6, p.getOldprice());
			ps.setString(7, p.getColor());
			ps.setString(8, p.getDetails());
			ps.setString(9, p.getInbox());
			ps.setString(10, p.getImage());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

//**************************************** view product********************************************
	public ArrayList<Product> viewproduct() {

		ArrayList<Product> vi = new ArrayList<>();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from product");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Product p = new Product();

				p.setPid(rs.getInt(1));
				p.setUid(rs.getInt(2));
				p.setCategory(rs.getString(3));
				p.setPname(rs.getString(4));
				p.setPrice(rs.getDouble(5));
				p.setOldprice(rs.getDouble(6));
				p.setColor(rs.getString(7));
				p.setDetails(rs.getString(8));
				p.setInbox(rs.getString(9));
				p.setImage(rs.getString(10));

				vi.add(p);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vi;
	}

//**************************************** delete product********************************************	
	public int delete(int id) {
		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("delete from product where pid=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

//**************************************** getby pid product********************************************

	public Product getById(int id) {

		Product p = new Product();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from product where pid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				p.setPid(rs.getInt(1));
				p.setUid(rs.getInt(2));
				p.setCategory(rs.getString(3));
				p.setPname(rs.getString(4));
				p.setPrice(rs.getDouble(5));
				p.setOldprice(rs.getDouble(6));
				p.setColor(rs.getString(7));
				p.setDetails(rs.getString(8));
				p.setInbox(rs.getString(9));
				p.setImage(rs.getString(10));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

//**************************************** update product********************************************	
	public int update(Product p) {
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement(
					"update product set category=?,pname=?,price=?,oldprice=?,color=?,details=?,inbox=?,image=? where pid=? ");
//			System.out.println("in product dao");
			ps.setInt(9, p.getPid());
			ps.setString(1, p.getCategory());
			ps.setString(2, p.getPname());
			ps.setDouble(3, p.getPrice());
			ps.setDouble(4, p.getOldprice());
			ps.setString(5, p.getColor());
			ps.setString(6, p.getDetails());
			ps.setString(7, p.getInbox());
			ps.setString(8, p.getImage());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

//**************************************** filter product********************************************	
	public ArrayList<Product> productbycategory(String category) {

		ArrayList<Product> vi = new ArrayList<>();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from product where category=?");
			ps.setString(1, category);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Product p = new Product();

				p.setPid(rs.getInt(1));
				p.setUid(rs.getInt(2));
				p.setCategory(rs.getString(3));
				p.setPname(rs.getString(4));
				p.setPrice(rs.getDouble(5));
				p.setOldprice(rs.getDouble(6));
				p.setColor(rs.getString(7));
				p.setDetails(rs.getString(8));
				p.setInbox(rs.getString(9));
				p.setImage(rs.getString(10));

				vi.add(p);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vi;
	}
}
