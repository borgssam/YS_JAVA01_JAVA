package ch08.sec01;

public class Radio implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("라디오가가 켜졌습니다.");	

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("라디오가 꺼졌습니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume < this.MIN_VOLUME) {
			this.volume = this.MIN_VOLUME;
		} else if (volume > this.MAX_VOLUME) {
			this.volume = this.MAX_VOLUME;
		} else {
			this.volume = volume;
		}
		
	}
	
	public void printVolume() {
		System.out.println("라디오볼륨: " + volume);		
	}

}
