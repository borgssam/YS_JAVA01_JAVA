package ch08.sec01;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//클래스 인터페이스가 public static 안적어줬을때
	//클래스 : default 메소드
	//인터페이스는 : public static 메소드
	
	//인터페이스에서 디폴트는 명시적으로 작성하여야한다.
	default void setMute(boolean mute) {
		if(mute) {
			setVolume(MIN_VOLUME);
			System.out.println("묵음처리함");
		} else {
			System.out.println("묵음처리 해제함");			
		}
	}

}
