package banking;

public class InsufficienBalanceException extends RuntimeException{ //예외발생
	public InsufficienBalanceException(String msg) {
		super(msg);
	}
}
