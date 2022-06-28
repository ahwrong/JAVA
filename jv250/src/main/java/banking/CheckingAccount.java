package banking;

public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	public CheckingAccount() {
		
	}
	
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

	public double getOverdraftAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setOverdraftAmount(double double1) {
		// TODO Auto-generated method stub
		
	}
}
