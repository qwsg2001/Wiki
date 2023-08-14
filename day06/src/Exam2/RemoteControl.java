package Exam2;

public interface RemoteControl {

	// static final double PI = 3.141592;
	// 무조건 인터페이스는 상수 필드만 가질수 있다.
	// 대문자로만 작성해주는것이 관례이다.

	int MAX_VOLUME = 10;
	int Min_VOLUME = 10;

	void turnOn();

	void trunOff();

	void setVolume(int volume);

	void setAudio(int audio);

	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		setVolume(Min_VOLUME);
		}
		else {
			System.out.println("무음 해체합니다.");
		}
	}
	
	//static (정적) 메소드
	//구현객체 없이 호출가능
	
	static void changeBettery() {
		System.out.println("리모컨 베터리를 교환합니다.");
	}
}
