package ch12.sec04;

public class ErrExample {

	public static void main(String[] args) {
		try {
			int value = Integer.parseInt("abc");
		} catch(NumberFormatException e) {
			System.err.println("예외발생");
			System.err.println(e.getMessage());			
		}

	}

}
