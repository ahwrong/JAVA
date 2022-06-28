package com.varxyz.banking.domain;

public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
//		super(accountNum, balance);
		super();
		this.overdraftAmount = overdraftAmount;
	}
	
	public void withdraw(double amount) {
		if(balance < amount) {
			//예외발생:금액 한도 내에서 추가 출금을 승인
			throw new InsufficienBalanceException("추가 출금을 승인");
		}else {
			balance = balance - amount;
		}
	}
}
