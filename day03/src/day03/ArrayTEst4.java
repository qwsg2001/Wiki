package day03;

import java.net.PortUnreachableException;
import java.util.ArrayList;

public class ArrayTEst4 {

	private static final char[] Week = null;

	public static void main(String[] args) {
		// 배열 사이즈 변경 불가 해결..
		//ArrayList 사용 
		
		ArrayList<String> list = new ArrayList<String>();
		//제너릭 타입 : Array(string)list = new ArrayList();
		
//		list.add(10);
//		list.add(20);
//		list.add(30);
		
		list.add("java");
		list.add("jan");
		list.add("dan");

		//for(int i = 0; i <list.size();i++) {
		//	System.out.println(list.get(i));
		//}
		
		for(String str : list){
			System.out.println(str);
		}
		
			
	}
}
