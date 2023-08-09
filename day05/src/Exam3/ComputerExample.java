package Exam3;



public class ComputerExample {
	public static void main(String args[]) {
		int r = 10;
		
		
		Calculaotr calculaotr = new Calculaotr();
		System.out.println("원 면적 : " + calculaotr.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원 면적 : " + computer.areaCircle(r));
	}
	
	
}
