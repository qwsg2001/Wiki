package day02;

import java.util.Scanner;

public class Iftest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 1 0부터 9사이의 정수를 입력받아
//		짝수 홀스를 판단하느는 코드를 작성하시오
//		단 if문으로 작성하자
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("0 ~ 9 사이의 정수를 입력해주세요 : ");
		num  = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		
		
	}

}
