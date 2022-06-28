package com.varxyz.jv251.domain;

import com.varxyz.jv251.exception.OverdraftExecetion;

public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	public CheckingAccount() {
		
	}
	
	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
		super(accountNum, balance);
		this.overdraftAmount = overdraftAmount;
	}
	
	public void withdraw(double amount) {
		if(balance < amount) {
			double overdraftNeeded = amount - balance;
			if(overdraftAmount < overdraftNeeded) {
				throw new OverdraftExecetion ("에러 : 대월금 초과", balance, overdraftNeeded);
			}else {
				balance = 0.0;
				overdraftAmount = overdraftAmount - overdraftNeeded;
			}
		}else {
			balance = balance - amount;
		}
	}

	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(double double1) {
		this.overdraftAmount = overdraftAmount;
		
	}
}
