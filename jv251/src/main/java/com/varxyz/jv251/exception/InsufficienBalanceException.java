package com.varxyz.jv251.exception;

@SuppressWarnings("serial")
public class InsufficienBalanceException extends RuntimeException{ 
	private double balance;
	
	public InsufficienBalanceException(String msg) {
		super(msg);
	}
	
	public InsufficienBalanceException(String msg, double balance) {
		super(msg);
		this.balance = balance;
	}
	
	@Override
	public String getMessage() {
		return super.getMessage() + " ���� �ܰ�� " + balance + " �Դϴ�.";
	}
}
