package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class J004_DeleteData {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cid :");
		int cid = sc.nextInt();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root");

			System.out.println("Connection Established.....");

			Statement st = cn.createStatement();
			int i = st.executeUpdate("delete from school.customer where cid='" + cid + "'");
			if (i > 0) {
				System.out.println("data deleted......");
			}
			sc.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
