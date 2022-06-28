package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExampleAccount6 {
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
			
			String sql = "INSERT INTO Account(accountNum, balance, interestRate, overdraft, customerId) "
					+ "VALUES (?, ?, ?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "111-11-1111");
			stmt.setDouble(2, 1000.0);
			stmt.setDouble(3, 0.03);
			stmt.setDouble(4, 0.0);
			stmt.setLong(5, 1035);
			stmt.executeUpdate();
			
			System.out.println("INSERTED....");
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
