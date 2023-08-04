package day02;

import java.util.Scanner;

public class Iftest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력홰 주세요 : ");
		
		// 1. 90점 이상이면 합격을 출력하기
		// 2. 점수를 입력 받아 학점 출력하기
		
		score = scan.nextInt();
		
		if(score  >= 90) {
			System.out.println("A");
		}
		else if(score >=80){
			System.out.println("B");
		}
		else if(score >= 70){
			System.out.println("C");
		}
		else if(score >= 60){
			System.out.println("D");
		}
		else {
			System.out.println("F");
		} 
			

	}

}
