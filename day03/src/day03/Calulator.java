package day03;

public class Calulator {

	
	int num1, num2;
	
	public Calulator() {
		
	}
	public Calulator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	//1. 메소드 (반환 타입 O 매개 변수 O)
	public int plus(int n1, int n2){
		return n1 + n2;
	}

	//2. 메소드 (반환 타입 x 매개 변수 O)
	public void minus(int n1, int n2) {
		System.out.println(n1 - n2);
	}
	//3. 메소드 (반환 타입 O 매개 변수 x)
	public int multi() {
		return num1 * num2;
	}
	//4. 메소드 (반환 타입 x 매개 변수 x)
	public void methodInfo(){
		System.out.println("반환 타입과 매개 변수가 없는 메소드 입니다.");
	}
	
}
