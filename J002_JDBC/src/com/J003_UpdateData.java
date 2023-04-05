package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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

			Statement st = cn.createStatement();
			int i = st.executeUpdate("update school.customer set cname='" + cname + "',address='" + address
					+ "' where cid='" + cid + "'");
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
