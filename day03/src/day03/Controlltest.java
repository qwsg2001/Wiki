package day03;

import java.util.Scanner;

public class Controlltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("================================================================================");
		System.out.println("1.가정용(1liter당 50원)\t, 2.상업용(1liter당 50원)\t, 3. 공업용(1liter당 30원\t)");	
		System.out.println("================================================================================");
		System.out.println("메뉴를 선택하세요 : ");
		Scanner scan = new Scanner(System.in);
		int code = scan.nextInt();
		int fare = 0 ;
		double tax = 0;
		System.out.println("사용량을 입력해주세요 : "); 
		int use = scan.nextInt();
		
		//if 문 작성
	
		if(code == 1) {
			fare = use * 50;		}
		else if(code == 2) {
			fare = use * 45;
			
		}else if(code==3){
			fare = use * 30;
		}else System.out.println("지원하지 않는 메뉴입니다. ");

//		switch(code) {
//			
//		case 1 : 
//			fare = use * 50;
//			break;
//		case 2 :
//			fare = use * 50;
//			break;
//		case 3 : 
//			fare = use * 50;
//		default : 
//			System.out.println("지원하지 않는 메뉴입니다. ");
//			break;
//		}
		
		System.out.println("=============================");
		System.out.println("사용자 코드  : " + code);
		System.out.println("사용자 요금  : " + fare);
		tax = fare + 0.05;
		double total = fare + tax;
		System.out.println("총 수도 요금: " + total);
		System.out.println("=============================");
			
	
		
		
	}
}
