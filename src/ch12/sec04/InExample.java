package ch12.sec04;

public class InExample {

	public static void main(String[] args) throws Exception{
		int speed = 0;
		int keyCode = 0;
		
		while(true) {
			if(keyCode==49) {
				speed += 1;
			} else if(keyCode==50) {
				speed -= 1;
			} else if(keyCode == 51 ) {
				break;
			}
			System.out.println("---------------------");
			System.out.println("1:증가, 2:감소, 3:종료");
			System.out.println("---------------------");
			System.out.println("현재속도:"+speed);
			keyCode = System.in.read();
		}
		
		System.out.println("프로그램종료");

	}

}
