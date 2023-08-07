package day03;

public class AiCartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person hong = new Person();
		Car sportCar = new Car();
		Car SadanCar = new Car(1000, "블랙");
		
		hong.age = 20;
		hong.name = "홍길동";
		
		//sportCar. run(50);
		//SadanCar. run(5000);
		System.out.println(sportCar.Spped);
		System.out.println(SadanCar.Spped);
		System.out.println(sportCar.color);
		System.out.println(SadanCar.color);
		hong.eat();
		hong.smile();
		
		
	}

}
