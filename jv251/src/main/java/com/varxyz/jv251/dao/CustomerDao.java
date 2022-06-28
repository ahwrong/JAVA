package com.varxyz.jv251.dao;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.varxyz.jv251.domain.Customer;

public class CustomerDao {

	
	public CustomerDao() {

	}
	/**
	 * ��ü �� ���� ��ȸ
	 * @return
	 */
	public ArrayList<Customer> findAllCustomers(){ 
		String sql = "SELECT * FROM Customer";
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DataSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Customer c = new Customer();  
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setUserId(rs.getString("userId"));
					customerList.add(c);
				}
			}finally {
				rs.close();
				pstmt.close();
				con.close();
			}	
		}catch(SQLException e){
			e.printStackTrace();
		}
		return customerList;
	}
	/**
	 * �ֹι�ȣ�� �� ��ȸ
	 * @param ssn
	 * @return
	 */
	public Customer findCustomerBySsn(String ssn) {
		String sql = "SELECT * FROM Customer WHERE ssn = ?";
		Customer c = null;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DataSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ssn);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					c = new Customer();   
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setUserId(rs.getString("userId"));
				}
			}finally {
				rs.close();
				pstmt.close();
				con.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return c;
	}
	/**
	 * �ű� ��� �� (add)
	 * @param customer  			����� �� ����
	 */
	public void addCustomer(Customer customer) {
		String sql = "INSERT INTO Customer(name, ssn, phone, userId, passwd)"
				+ " VALUES (?, ?, ?, ?, ?)";
		try {
			Connection con = DataSourceManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getSsn());
			pstmt.setString(3, customer.getPhone());
			pstmt.setString(4, customer.getUserId());
			pstmt.setString(5, customer.getPassword());
			pstmt.executeUpdate(); 
			pstmt.close();
			con.close();
			System.out.println("INSERTED....");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}