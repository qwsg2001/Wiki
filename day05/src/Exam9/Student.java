package Exam9;

import java.util.Scanner;

public class Student extends Person {
	
	private String sID;
	private String className;
	
	public String getsID() {
		return sID;
	}

	public void setID(String sID) {
		this.sID = sID;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void inputInfo() {
		// TODO Auto-generated method stub
		super.inputInfo();
		System.out.println("학번을 입력하세요>");
		Scanner scan = new Scanner(System.in);
		String sid = scan.next();
		setID(sid);
		
		System.out.println("수강과목을 입력하세요>");
		String cm = scan.next();
		setClassName(cm);
		
	}

	@Override
	public String personInfo() {
		// TODO Auto-generated method stub
		
		String str = super.personInfo();
		str += "\n학번" + sID + "\n수강과목" + className;
		return str;
	}

	
	
	
	
}