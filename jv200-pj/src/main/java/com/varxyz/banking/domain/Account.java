package com.varxyz.banking.domain;
/**
 * °èÁÂ Á¤º¸
 * @author Administrator
 * 
 * 
 */
public class Account {
	protected String accountNum;
	protected double balance;
	protected Customer customer;
	private String accoutNum;
	
	public void Accout(String accoutNum, double balance) {
		this.accoutNum = accountNum;
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
	
	
	public void setCustomer(Customer customar) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
}
