package ch11.sec06;

public class Account {
	private long balance;
	
	public Account() {}

	public long getBalance() {
		return balance;
	}
	
	//입금
	public void deposit(int money) {
		balance += money;
	}
	
	//출금
	public void withdraw(int money) throws InsufficientException {
		//잔고가 부족하면
		if(balance < money) {
			throw new InsufficientException("잔고부족 : "
						+(money-balance)+"모자람");
		}
		balance -= money;
		
	}

}
