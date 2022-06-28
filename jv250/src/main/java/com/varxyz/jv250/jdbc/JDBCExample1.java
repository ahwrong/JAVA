package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample1 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			try {
				Class.forName(driver);
				System.out.println("LOADED DRIVER ---> " + driver);

				con = DriverManager.getConnection(url, id, passwd); 	/*DriverManager = static*/
				System.out.println("CONNECTED TO ---> " + url); 		//sql을 전달하기 위해서(문자열로 전달)

				String sql = "SELECT * FROM Customer WHERE name='유비'";
				stmt = con.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					long cid = rs.getLong("cid");
					String customerId = rs.getString("customerId");
					String name = rs.getString("name");
					String phone = rs.getString("phone");
					System.out.println(cid);
					System.out.println(customerId);
					System.out.println(name);
					System.out.println(phone);
					System.out.println("--------------------------------------");
				}
			}finally {					
				rs.close();
				stmt.close();
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace(); //단계별 에러 출력
		}

	}
}