package day03;

public class CalTest {
	
	public static void main(String args[]) {
		Calulator calulator1 = new Calulator();
		Calulator calulator2 = new Calulator(200,300);
		
		//메소드 호출
		int cresult = calulator1.plus(40,50);
		System.out.println("더하기 : " + cresult);
		
		//뺴기 메소드 호출
		calulator1.minus(40,50);
		
		//곱하기 메소드 호출
		System.out.println(calulator2.multi());

		//메소드정보 출력하는 메소드 호출
		calulator1.methodInfo();
		
		
		
	}
}
