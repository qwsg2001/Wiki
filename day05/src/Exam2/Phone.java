package Exam2;

public class Phone {

	public String model;
	public String color;
	
	
	public void sendVoice(String message) {
		System.out.println("자기:"+message);
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone(String model,String color) 생성자 실행");
		
	}
	
}
