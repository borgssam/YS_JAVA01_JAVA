package ch08.sec01;

public class TV implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV가 켜졌습니다.");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV가 꺼졌습니다.");

	}
	
	int memoryVolume;

	@Override
	public void setMute(boolean mute) {
		if(mute) {			
			this.memoryVolume = this.volume;   //묵음요청이면 현재볼륨을 임시저장
			RemoteControl.super.setMute(mute); //현재볼륨을 최소값(0)으로
		} else {
			this.volume = this.memoryVolume;   //임시저장 볼륨값을 현재볼륨값으로 
			RemoteControl.super.setMute(mute); //묵음해제하기 호출			
		}
		
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
		System.out.println("TV볼륨: " + volume);		
	}

}
