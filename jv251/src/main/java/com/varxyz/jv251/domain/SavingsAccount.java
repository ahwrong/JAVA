package com.varxyz.jv251.domain;

import java.util.Date;

import com.varxyz.jv251.exception.InsufficienBalanceException;

public class SavingsAccount extends Account{
	private double interestRate;

	public  SavingsAccount() {
		
	}
	
	public SavingsAccount(String accountNum, double balance) {
		this(accountNum, balance, 0.0);
	}
	
	public SavingsAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}
	
	public void withdraw(double amount) {
		if(balance - amount < 0) {
			throw new InsufficienBalanceException("�ܰ����");
		}
		super.balance -= amount;
		}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double double1) {
	
		
	}

	public void setRegDate(Date date) {
	
		
	}

}