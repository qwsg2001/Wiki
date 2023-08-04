package day02;

import java.lang.runtime.SwitchBootstraps;


public class IfDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//난수 생성 0.0 <= Math.random() <1.0
		//1~6
		int n = (int)(Math.random()*6) +1;
		
		switch (n) {
		case 1: 
			System.out.println("1번이 나왔습니다.");
			break;
		case 2: 
			System.out.println("1번이 나왔습니다.");
			break;
	
		case 3: 
			System.out.println("1번이 나왔습니다.");
			break;
		case 4:
			System.out.println("1번이 나왔습니다.");
			break;
		case 5: 
			System.out.println("1번이 나왔습니다.");
			break;
		case 6 : 
			System.out.println("1번이 나왔습니다.");
			break;
		default:
			System.out.println("해당되는 값이 존재하지 않습니다.");
			break;
		
		}
	}
}

 

