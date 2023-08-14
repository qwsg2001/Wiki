package Exam2;

public class RemoteControlExample {
	public static void main(String args[]) {
		//////////////////////////
		RemoteControl re;
		re = new Television();
		//////////////////////////
		Audio ra;
		re = new Audio();
		///////////////////////////
		
		re.turnOn();
		re.setVolume(5);
		re.trunOff();

		re.turnOn();
		re.setVolume(20);
		re.trunOff();
		
		re.setMute(true);
		re.setMute(false);
		
		RemoteControl.changeBettery();
	}
}
