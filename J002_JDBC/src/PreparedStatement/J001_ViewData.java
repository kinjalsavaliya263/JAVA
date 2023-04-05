package PreparedStatement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J001_ViewData {
	public static void main(String[] args) throws SQLException {
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("hello...");

			// define connection url

			String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
			System.out.println("define connection.......");

			// established the connection
			Connection cn = DriverManager.getConnection(url);
			System.out.println("connection established");

			// create statement
			PreparedStatement ps = cn.prepareStatement("select * from tsql.emp");
			System.out.println("create statment...");

			// execute query
			ResultSet rs = ps.executeQuery();
			System.out.println("execute query...");

			// process resultset
			while (rs.next()) {
				int Empno = rs.getInt(1);
				String Ename = rs.getString(2);
				String job = rs.getString(3);
				int Mgr = rs.getInt(4);
				Date hiredate = rs.getDate(5);
				double sal = rs.getDouble(6);
				double Comm = rs.getDouble(7);
				int Deptno = rs.getInt(8);

				System.out.println(Empno + " " + Ename + " " + job + " " + Mgr + " " + hiredate + " " + sal + " " + Comm
						+ " " + Deptno);

			}

			// close the connection
			cn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
