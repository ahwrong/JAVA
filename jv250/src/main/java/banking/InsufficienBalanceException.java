package banking;

public class InsufficienBalanceException extends RuntimeException{ //���ܹ߻�
	public InsufficienBalanceException(String msg) {
		super(msg);
	}
}
