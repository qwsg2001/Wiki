package Exam3;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		supersonicAirplain sa = new supersonicAirplain();
		sa.takeOff();
		sa.fly();
		sa.flyMode = supersonicAirplain.SUPERSONIC;
		sa.fly();
		sa.flyMode = supersonicAirplain.NOMAL;
		sa.fly();
		sa.land();
		
		

	}

}
