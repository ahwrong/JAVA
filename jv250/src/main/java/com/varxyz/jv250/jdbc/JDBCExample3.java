package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample3 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		
		try {
			Class.forName(driver);
			System.out.println("LOADED DRIVER ---> " + driver);
		
			Connection con = DriverManager.getConnection(url, id, passwd); 	
			System.out.println("CONNECTED TO ---> " + url); 		
			
			String sql = "INSERT INTO Customer(name, ssn, phone, customerId, passwd) "
					+ "VALUES (?, ?, ?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "����");
			stmt.setString(2, "920812-1234586");
			stmt.setString(3, "010-4554-5533");
			stmt.setString(4, "sql");
			stmt.setString(5, "1111");
			stmt.executeUpdate();
			
			System.out.println("INSERTED....");
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
