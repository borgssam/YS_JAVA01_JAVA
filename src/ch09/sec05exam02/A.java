package ch09.sec05exam02;

public class A {
	//바깥클래스 인스턴스 멤버
	String field = "A필드";
	void method() {
		System.out.println("A의 인스턴스 메소드 실행");
	}
	
	//바깥글래스 정적맴버
	static String staticField = "A정적필드";
	static void staticMethod() {
		System.out.println("A의 정적 메소드 실행 =>"+staticField );
	}
	
	class B{
		String field = "B필드";
		void method() {
			System.out.println("B의 인스턴스 메소드 실행");
		}
		void print() {
			//B의 멤버접근
			System.out.println(this.field);
			this.method();
			
			//바깥 클래스의 멤 접근
			System.out.println(A.this.field);
			A.this.method();		
		}
	}
	
	void useB() {
		B b = new B();
		b.print();
	}
	
	static class C{
		
		void method2() {
			staticField = "A정적필드 변경";
			staticMethod();
		}
	}
	

}
