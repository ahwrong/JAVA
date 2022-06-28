package com.varxyz.jv251.exception;

public class OverdraftExecetion extends InsufficienBalanceException {
	private double overdraftAvail;
	
	public OverdraftExecetion(String msg, double balance, double overdraftAvail) {
		super(msg, balance);
		this.overdraftAvail = overdraftAvail;
	}
			
	@Override
	public String getMessage() {
		return super.getMessage() + " ��� ������ �������  " + overdraftAvail + " �Դϴ�.";
	}
}
