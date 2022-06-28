package com.varxyz.banking.domain;

public class InsufficienBalanceException extends RuntimeException{ //예외발생
	public InsufficienBalanceException(String msg) {
		super(msg);
	}
}
