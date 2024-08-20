package ch09.sec03.exam01;


public class A {
	static class B{
		//인스턴스 변수
		int field1 = 1;
		
		//정적변수
		static int field2 = 2;
		
		//생성자
		B(){
			System.out.println("B클래스 생성자 실행2");
		}
		
		//인스턴스 메소드
		void method1() {
			System.out.println("B메소드1 실행");
		}
		static void method2() {
			System.out.println("B 스태틱 메소드2 실행");
		}		
	}
	

}
