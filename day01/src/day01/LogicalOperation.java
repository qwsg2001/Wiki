package day01;

public class LogicalOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'A';
		int cahrCode2 = 10;

		//		if(	(65 <=charCode) & (charCode<=90)){
		//			System.out.println("대문자이군요");
		//		}
		//		
		//		if(	(97 <=charCode) & (charCode<=122)){
		//			System.out.println("소문자이군요");
		//		}
		//		if(	(48 <=charCode) & (charCode<=57)){
		//			System.out.println("0~9 숫자이군요");
		//		}
		//		
		//		int value = 6;
		//		if(	(value%2 == 0) & (value%3==0)){
		//			System.out.println("2 또는 3의 배수이군요.");
		//		}
		//		
		//		boolean result = (value%2==0) || (value%3==0);
		//		if(! result) {
		//			System.out.println("2 또는 3의 배수가 아니군요.");
		//		}
		//		if(	(65 <=charCode) && (charCode<=90)){
		//			System.out.println("대문자이군요");
		//		}
		//		if(	(15 <=cahrCode2) || (cahrCode2<=160)){
		//			System.out.println("놀이기구 탑승가능 이군요");
		//		}
		//		if(	(cahrCode2 % 2) % 2 == 0)System.out.println("짝수");
		//		else System.out.println("홀수입니다.");
		//			
		//		//3항 연산자
		//		boolean k;
		//		k = (cahrCode2 % 2) ==0;
		//		
		//		System.out.println(k);
		//		System.out.println(k?"짝수" : "홀수");
		//		
		//		
		//		int x = 10;
		//		int y = 20;
		//		int z = (++x) + (--y);
		//		System.out.println(z);

				int pencils = 534;
				int students = 30;
		//		
				int pencilsPerStudent = pencils / students;
				System.out.println(pencilsPerStudent);
		
				int pencilsLeft = pencils % students;
				System.out.println(pencilsLeft);

		//		
		//		int lengthTop = 5;
		//		int lengthBottom = 10;
		//		int height = 7;
		//		double area = (double) ( lengthTop + lengthBottom) * height /2;
		//		System.out.println(area);


		//		int x = 10;
		//		int y = 5;
		//		
		//		System.out.println(	(x>7) && (y<=5));
		//		System.out.println(	(x%3 == 2) || (y%2 != 1) );

		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;

		if(Double.isNaN(z))System.out.println("0.0으로는 나눌수 없습니다.");
		else {
			double result = z + 10;
			System.out.println(z);
		}


		//(charCode2 % 2) == 0 ? System.out.println("짝수입니다.") : System.out.println("홀수입니다.");

		//System.out.println("짝수"): System.out.println("홀수");

	}
}
