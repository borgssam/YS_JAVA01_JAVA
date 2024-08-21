package ch12.sec05;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] selectNum = new int[6];
		Random random = new Random(3);
		System.out.println("선택번호");
		
		for(int i =0 ; i < 6; i++) {
			selectNum[i] = random.nextInt(45) + 1;
		}
		System.out.println(Arrays.toString(selectNum));
		
		//당첨번호
		int[] winNum= new int[6];
		random = new Random(3);
		random.nextInt(45);
		System.out.println("당첨번호");
		
		for(int i =0 ; i < 6; i++) {
			winNum[i] = random.nextInt(45) + 1;
		}
		System.out.println(Arrays.toString(winNum));
		
		Arrays.sort(selectNum);
		Arrays.sort(winNum);
		if(Arrays.equals(selectNum, winNum)) {
			System.out.println("복권 1등 당첨");
		} else {
			System.out.println("꽝");
		}
		

	}

}
