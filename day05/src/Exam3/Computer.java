package Exam3;



public class Computer extends Calculaotr {
	
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 ararCircle() 실행");
		return Math.PI * r * r;
	}
}
