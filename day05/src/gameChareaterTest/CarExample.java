package gameChareaterTest;

public class CarExample {
	public static void main(String args[]){
		
		Car myCar = new Car();
		
		myCar.tire = new Tire();
		myCar.run();
		
		
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
		
		
	}
	
}

class Tire {

	// 메소드 선언
	public void roll() {
		System.out.println("회전합니다.");
	}
}


class HankookTire extends Tire {

	@Override
	public void roll() {
		System.out.println("한국타이가 회전합니다.");
	}
}

class KumhoTire extends Tire{
	@Override
	public void roll() {
		System.out.println("금호타이어가 회전합니다.");
	}
}

class Car{
	public Tire tire;
	
	public void run() {
		tire.roll();
	}
}