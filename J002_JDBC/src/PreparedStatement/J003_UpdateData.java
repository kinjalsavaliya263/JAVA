package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class J003_UpdateData {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cid :");
		int cid = sc.nextInt();
		System.out.println("Enter the cname:");
		String cname = sc.next();
		System.out.println("Enter the address :");
		String address = sc.next();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root");

			System.out.println("Connection Established.....");

			PreparedStatement ps = cn.prepareStatement("update school.customer set cname=?,address=? where cid=?");
			ps.setInt(3, cid);
			ps.setString(1, cname);
			ps.setString(2, address);
			int i = ps.executeUpdate();
			if (i > 0) {
				System.out.println("data update......");
			}
			sc.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
