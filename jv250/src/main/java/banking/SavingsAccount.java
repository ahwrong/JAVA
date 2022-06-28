package banking;

import java.util.Date;

public class SavingsAccount extends Account{
	private static final double DEFAULT_INTEREST_RATE = 0.03;
	private double interestRate;

	public  SavingsAccount() {
		
	}
	
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
			//예외발생:잔고부족
			throw new InsufficienBalanceException("잔고부족");
		}else {
			super.balance -= amount;
		}
	}

	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setInterestRate(double double1) {
		// TODO Auto-generated method stub
		
	}

	public void setRegDate(Date date) {
		// TODO Auto-generated method stub
		
	}

}