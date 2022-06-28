package banking;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * °èÁÂ Á¤º¸
 * @author Administrator
 * 
 * 
 */
public class Account {
	protected long aid;
	protected String accountNum;
	protected double balance;
	protected Customer customer;
	protected Timestamp regDate;
	protected char accountType;
	
	public char getAccountType() {
		return accountType;
	}

	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}

	public Account () {
		
	}
	
	public long getAid() {
		return aid;
	}

	public void setAid(long aid) {
		this.aid = aid;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp date) {
		this.regDate = date;
	}

	public void Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	public void deposite(double amount) {
		this.balance += amount;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
}
