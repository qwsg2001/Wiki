package day02;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 10까지의 정수 출력 중 3,6,9 일때 박수 소리 짝을 출력하라
		//for(int i = 1; i <= 10; i++) {
		//	if(i == 3 || i ==  6 || i == 9) {
		//		System.out.printf("짝");
		//		continue;
		//	}System.out.printf("%d" , i);	
			
		//}
		boolean run = true;
		int balance = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
		System.out.println("===============================================");
		System.out.println(" | 1. 예금\t | 2.출금\t | 3.잔고\t | 4.종료\t |");
		System.out.println("===============================================");
		System.out.println("선택 > ");
		
		int menuNum = scan.nextInt();
		
		switch(menuNum) {
		
		case 1:
			System.out.println("예금액 > ");
			balance += scan.nextInt();
			break;
			
		case 2:
			System.out.println("출금액 > ");
			balance -= scan.nextInt();
			break;
		case 3: 
			System.out.printf("잔고 :  > ");
			System.out.println(balance);
			break;

		case 4: 
			run = false;
			break;
			}
		}
	}
}

