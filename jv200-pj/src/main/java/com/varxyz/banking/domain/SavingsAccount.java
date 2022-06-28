package com.varxyz.banking.domain;

public class SavingsAccount extends Account{
	private static final double DEFAULT_INTEREST_RATE = 0.03;
	private double interestRate;

	public SavingsAccount(String accountNum, double balance) {
		this(accountNum, balance, DEFAULT_INTEREST_RATE);
	}
	
	public SavingsAccount(String accountNum, double balance, double interestRate) {
//		super(accountNum, balance);
		super();
		this.interestRate = interestRate;
	}
	
	public void withdraw(double amount) {
		if(balance - amount < 0) {
			//���ܹ߻�:�ܰ�����
			throw new InsufficienBalanceException("�ܰ�����");
		}else {
			super.balance -= amount;
		}
	}

}