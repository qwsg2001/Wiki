package day02;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Game Menu");
		System.out.println(" 1. 가위\t  2.바위\t 3. 보\t (9: 종료)");
		System.out.println(" ============================");
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("입력하세요 : ");
		int user = scan.nextInt();
		
		int com = (int)(Math.random()*3)+1;
		
		//승패 판단하기
		System.out.println("User : " + user);
		System.out.println("com : " + com);
		
		if((user ==1 && com == 3) || (user ==2 && com == 1) || (user ==3 && com == 2)){
			System.out.println("이겼습니다.");
		}
		else if((user ==1 && com == 1) || (user ==2 && com == 2) || (user ==3 && com == 3)) {
			System.out.println("비겼습니다.");
		}
		else {
			System.out.println("졌습니다.");
		}
		

		
	}

}
