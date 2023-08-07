package day01;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int midlescore;
			int finalscore;
			Scanner scan = new Scanner(System.in);
			
			midlescore =  scan.nextInt();
			finalscore = scan.nextInt();
			
			System.out.println("학기 전 홍팍이의 중간 점수 : ");
			System.out.println(midlescore);
			System.out.println("학기 전 홍팍이의 기말 점수 : ");
			System.out.println(finalscore);
	}

}
