package com.varxyz.banking.domain;

public class InsufficienBalanceException extends RuntimeException{ //���ܹ߻�
	public InsufficienBalanceException(String msg) {
		super(msg);
	}
}
