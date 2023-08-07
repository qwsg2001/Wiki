package day03;

public class ArrayTEst1 {

	public static void main(String[] args) {
		// 배열을 이용해서 30개의 정수를 저장하고 평균값을 구하는 프로그램을 작성
		
		// 1. 배열 선언 
		int[] scores;
		
		// 2. 배열의 초기화
		scores = new int[30];
		
		// 3. 명시적 초기화
		scores[0] = 83;
		scores[1] = 90;
		
		// 3. 배열 선언 동시에 하는 방법
		int[] scores1 = {83, 96, 70, 60, 50 ,40 ,30 ,20 ,100, 90};
		
		// 4. 각각의 원소 값을 꺼낸서 합산후 배열 갯수를 나눈다...
		
		int sum = 0;
		
			
		// 값 수정 방법
		scores1[2] = 90;
		for (int i = 0; i < 10; i++) {
		System.out.println(scores1[i] + " ");
		}
			
		for(int i = 0; i < 10; i++) {
		sum += scores1[i];
		System.out.println("평균 : " + sum / scores1.length); 
			
			}
	}

}
