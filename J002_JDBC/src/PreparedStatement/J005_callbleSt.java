package PreparedStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class J005_callbleSt {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root");
			System.out.println("db connected...");

			CallableStatement cb = cn.prepareCall("call addemp(?,?,?)");
			cb.setString(1, "Nidhi");
			cb.setString(2, "Testing");
			cb.setDouble(3, 8000);

			cb.execute();
			System.out.println("data inseterd");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}