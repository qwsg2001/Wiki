package day03;

public class Car {

	int Spped = 10;
	String color = "빨강";
	
	public Car() {
		// 1, 생성자 할일 >>>객체 생성시 호출
		// 2, 멤버변수의 초기화
		
	}

	public void run(int s) {

		Spped += Spped;
		System.out.println(this.Spped + "속도로 달린다.");
	}
	

	public void stop(int spped) {
		this.Spped = Spped;
		Spped = Spped;
		if(Spped ==0) Spped =10;
		System.out.println(Spped + "속도로 달린다.");
	}
	
	//생성자 중복정의
	//이름은 같고 매개변수와 갯수 종류가 다르다..
	public Car(int spped, String color) {
		this.Spped = spped();
		this.color = color(); 
	}

	private String color() {
		// TODO Auto-generated method stub
		return null;
	}

	private int spped() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
