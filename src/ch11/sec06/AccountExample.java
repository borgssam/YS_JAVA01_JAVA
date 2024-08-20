package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		
		acc.deposit(10000);
		System.out.println("예금액:"+acc.getBalance());
		
		//출금하기
		try {
			acc.withdraw(30000);
		}catch( InsufficientException e) {
			System.out.println(e.getMessage());			
		}

	}

}
