package ch12.sec12;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 1");
	}
	
	@PrintAnnotation(value="#")
	public void method2() {
		System.out.println("실행 2");
	}
	
	@PrintAnnotation(value="*", number=30)
	public void method3() {
		System.out.println("실행 3");
	}

}
