package ch08.sec01;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//클래스 인터페이스가 public static abstract 등을 안적어줬을때
	//클래스 : default 메소드
	//인터페이스는 : public abstract 메소드
	
	//인터페이스에서 디폴트는 명시적으로 작성하여야한다.
	default void setMute(boolean mute) {
		if(mute) {
			setVolume(MIN_VOLUME);
			System.out.println("묵음처리함");
		} else {
			System.out.println("묵음처리 해제함");			
		}
	}
	
	static void changeBattery() {
		System.out.println("리모트 건전지를 교환합니다.");
	}
	
	
	private void privateFunc() {
		System.out.println("privateFunc 호출 연세IT직업학교입니다.");
	}

	//인터페이스_변수명.callPrivateFunc(); 
	public default void callPrivateFunc() {
		privateFunc();
		System.out.println("안녕하세요");
	}
	public default void callPrivateFunc2() {
		privateFunc();
		System.out.println("안녕히가세요");
	}
	public default void callPrivateFunc3() {
		privateFunc();
		System.out.println("어서오세요");
	}
	
	private static void privateStaticFunc() {
		System.out.println("privateStaticFunc 호출");		
	}
	
	//인터페이스명.callPrivateStaticFunc(); 
	public static void callPrivateStaticFunc() {
		privateStaticFunc();
	}
}
