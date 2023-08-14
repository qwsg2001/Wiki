package Exam2;

public class Audio implements RemoteControl{
	private int audio;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 켭니다.");
		
	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 끕니다.");

	}

	@Override
	public void setAudio(int audio) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > RemoteControl.MAX_VOLUME) {
			this.audio = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.Min_VOLUME) {
			this.audio = RemoteControl.Min_VOLUME;
		} else {
			this.audio = volume;
		}
		System.out.println("현재 Audio 볼륨 : "+ audio);

	}

}
