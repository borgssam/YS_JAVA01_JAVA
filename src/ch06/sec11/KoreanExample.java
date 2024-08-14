package ch06.sec11;

public class KoreanExample {

	public static void main(String[] args) {
		Korean yjh = new Korean("123456","김지민");
		//yjh.ssn = "961011-2151564";
		yjh.name = "김지민";
		
		System.out.printf("%s %s %s\n",
				yjh.nation,
				yjh.ssn,
				yjh.name);

//		yjh.nation = "미국";
		yjh.name = "홍지민";	
//		yjh.ssn = "000000-2222222";	
	
		System.out.printf("%s %s %s\n",
				yjh.nation,
				yjh.ssn,
				yjh.name);
		
		
		
		

	}

}
