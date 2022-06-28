package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExampleAccount8 {
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
			
			String sql = "DELETE FROM Account WHERE aid=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setLong(1, 3002);
			stmt.executeUpdate();
			
			System.out.println("DELETE....");
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
