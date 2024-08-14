package ch06.sec13.pack1;

import ch06.sec13.pack2.C;

public class A {
	int gValue;
	public int publicValue;
	private int privateValue;
	
	public int pubFunc() {
		B _b = new B();
		_b.publicValue = 3;
		_b.gValue = 4;
//		_b.privateValue = 5; //에러 : 프라이빗은 본인 만 접근가능
		_b.pubFunc();
//		_b.priFunc(); //에러: 외부 객체의 프라이빗 메소드는 접근 불가능
		
		
		C _c = new C();
		_c.publicValue = 5;
//		_c.gValue = 7;//에러: 다른패키지의 디폴트는 접근불가능
//		_c.privateValue //에러 프라이빗은 본인 만 접근가능
		
		this.privateValue = 7; //나자신의 private 은 접근가능
		_c.pubFunc();
//		_c.priFunc(); //에러: 외부객체의 프라이빗 메소드는 호출 불가능
		
		return 0;
	}
	public int priFunc() {
		return 0;
	}

}
