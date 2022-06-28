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
			//���ܹ߻�:�ݾ� �ѵ� ������ �߰� ����� ����
			throw new InsufficienBalanceException("�߰� ����� ����");
		}else {
			balance = balance - amount;
		}
	}
}
