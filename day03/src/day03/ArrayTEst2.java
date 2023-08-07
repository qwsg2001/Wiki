package day03;

public class ArrayTEst2 {

	public static void main(String[] args) {
		// 문자열 3개의 값을 저장하는 배열 생성
		String[] names = {"감자바","조리퐁","포카칩","스윙칩","박길동"};
		
		//String[] names2 = new String[3];
		
		//String[] names2 = null;
		//names2 = new String[] ("와우");
		
		// names[0] = "박자바";
		
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]); 
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println(names + " + " + (num1 * num2));

	}
}
