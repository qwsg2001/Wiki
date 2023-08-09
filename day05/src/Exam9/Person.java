package Exam9;

import java.util.Scanner;

public abstract class Person{

	String cname;

	public String personInfo() {
		// TODO Auto-generated method stub
		String str = "\n이름"+ cname;
		return str;
		
}

	public void printAll() {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return cname;
	}
	
	public void inputInfo() {
		System.out.println("이름을 입력하세요 : ");
		Scanner scan1 = new Scanner(System.in);
		String n = scan1.next();
		cname = n;
		
	}
}
	
	 
	
	
	