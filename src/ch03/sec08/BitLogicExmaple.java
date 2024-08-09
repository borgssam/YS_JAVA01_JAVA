package ch03.sec08;

public class BitLogicExmaple {

	public static void main(String[] args) {
		byte x = 45;
		byte y = 25;
		System.out.printf("%d & %d = %d \n", x, y, x&y);
		System.out.printf("%x & %x = %x \n", x, y, x&y);
		System.out.println("-----------------------");
		System.out.printf("%d | %d = %d \n", x, y, x|y);
		System.out.printf("%x | %x = %x \n", x, y, x|y);
		System.out.println("-----------------------");
		System.out.printf("%d ^ %d = %d \n", x, y, x^y);
		System.out.printf("%x ^ %x = %x \n", x, y, x^y);
		System.out.println("-----------------------");
		System.out.printf("~ %d = %d \n", x, ~x);
		System.out.printf("~ %x = %x \n", x, ~x);
		System.out.println("-----------------------");

	}

}
