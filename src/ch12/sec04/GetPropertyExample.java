package ch12.sec04;

public class GetPropertyExample {

	public static void main(String[] args) {

		//운영체계정보
		String osName = System.getProperty("os.name");
		System.out.println("운영체계:"+ osName);

	}

}
