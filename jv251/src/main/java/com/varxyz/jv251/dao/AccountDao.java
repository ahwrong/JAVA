package com.varxyz.jv251.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.varxyz.jv251.domain.Account;
import com.varxyz.jv251.domain.CheckingAccount;
import com.varxyz.jv251.domain.Customer;
import com.varxyz.jv251.domain.SavingsAccount;

public class AccountDao {

	public AccountDao() {
		
	}
	public void addAccount(Account account) {
		String sql = "INSERT INTO Account(accountNum, balance, interestRate,"
				+ " overdraft, accountType, customerId)"
				+ " VALUES (?, ?, ?, ?, ?, ?)";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = DataSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, account.getAccountNum());
				pstmt.setDouble(2, account.getBalance());
				if(account instanceof SavingsAccount) {
					SavingsAccount sa = (SavingsAccount)account;
					pstmt.setDouble(3, sa.getInterestRate());
					pstmt.setDouble(4, 0.0);
					pstmt.setString(5, String.valueOf('S'));
				}else {
					CheckingAccount ca = (CheckingAccount)account;
					pstmt.setDouble(3, 0.0);
					pstmt.setDouble(4, ca.getOverdraftAmount());
					pstmt.setString(5, String.valueOf('C'));
				}
				pstmt.setLong(6, account.getCustomer().getCid());
				pstmt.executeUpdate();
			}finally  {
				pstmt.close();
				con.close();
			}
			System.out.println("NEW ACCOUNT INSERTED...\n");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * ���޵� �ֹι�ȣ�� ���� Ư�� ���� ���� ��� ��ȸ
	 * @param ssn		�ֹι�ȣ
	 * @return
	 */
	public List<Account> findAccountsBySsn(String ssn){
		String sql = "SELECT a.aid, a.accountNum, a.balance, a.interestRate, "
				+ " a.overdraft, a.accountType, c.name, c.ssn, c.phone, a.regDate "
				+ " FROM Account a INNER JOIN Customer c ON a.customerId = c.cid"
				+ " WHERE c.ssn = ? ";
		List<Account> list = new ArrayList<>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DataSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ssn);
				rs = pstmt.executeQuery();
				Account account = null;
				while(rs.next()) {
					if(rs.getString("accountType").charAt(0) == 'S') {
						account = new SavingsAccount();
						((SavingsAccount)account).setInterestRate(
								rs.getDouble("interestRate"));
					}else {
						account = new CheckingAccount();
						((CheckingAccount)account).setOverdraftAmount(
								rs.getDouble("overdraft"));
					}
					account.setAid(rs.getLong("aid"));
					account.setAccountNum(rs.getString("accountNum"));
					account.setBalance(rs.getDouble("balance"));
					account.setCustomer(new Customer(rs.getString("name"), 
							rs.getString("ssn"), rs.getString("phone")));
					account.setRegDate(rs.getTimestamp("regDate"));
					list.add(account);
				}

			}finally  {
				rs.close();
				pstmt.close();
				con.close();
			}
			System.out.println("NEW ACCOUNT INSERTED...\n");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	} 

	/**
	 * ��ϵ� ��� ���� ��� ��ȸ 
	 * @return
	 */
	public List<Account> findAllAccounts(){
	      String sql = "SELECT * FROM Account";
	      List<Account> accountList = new ArrayList<Account>();
	      
	      try {
	         Connection con = null;
	         PreparedStatement pstmt = null;
	         ResultSet rs = null;
	         try {
	        	con = DataSourceManager.getConnection();
	            pstmt = con.prepareStatement(sql);
	            rs = pstmt.executeQuery();
	            while(rs.next()) {
	               Account a = new Account();
	               a.setAccountNum(rs.getString("AccountNum"));
	               a.setBalance(rs.getDouble("blance"));
	               if(a instanceof SavingsAccount) {
	                  SavingsAccount sa = (SavingsAccount)a;
	                  sa.setInterestRate(rs.getDouble("interestRate"));
	                  sa.setAccountType(rs.getString("accountType").charAt(0));
	               }else if( a instanceof CheckingAccount) {
	                  CheckingAccount ca = (CheckingAccount)a;
	                  ca.setOverdraftAmount(rs.getDouble("overdraft"));
	                  ca.setAccountType(rs.getString("accountType").charAt(0));
	               }
	               a.getCustomer().setCid(rs.getLong("customerId"));
	               accountList.add(a);
	            }
	         }finally {
	            rs.close();
	            pstmt.close();
	            con.close();
	         }
	         
	      }catch(SQLException e) {
	         e.printStackTrace();
	      }
	      return accountList;
	   }

} 
