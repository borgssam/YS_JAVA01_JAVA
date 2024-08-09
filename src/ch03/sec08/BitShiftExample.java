package ch03.sec08;

public class BitShiftExample {
	public static void main(String [] args) {
		byte num1 = 2;
		int shift = 3;
		byte result1 = (byte)(num1 << shift);
		System.out.printf(" %d << %d = %d\n",num1, shift, result1);

		int num = Integer.parseInt(Integer.toBinaryString(num1 & 0xFF));
		int result = Integer.parseInt(Integer.toBinaryString(result1 & 0xFF));		
		System.out.printf("0b%08d << %d = 0b%08d\n",num, shift, result );
	}
}
