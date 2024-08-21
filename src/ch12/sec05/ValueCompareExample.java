package ch12.sec05;

public class ValueCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer obj1 = 10;
		Integer obj2 = 10;
		System.out.println(obj1 == obj2);  //true
		System.out.println(obj1.equals(obj2));//true
		
		Integer obj3 = 210;
		Integer obj4 = 210;
		System.out.println(obj3 == obj4);   //false
		System.out.println(obj3.equals(obj4));//true
		

	}

}
