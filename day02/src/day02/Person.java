package day02;

public class Person {
	
	String name;
	static int age;
	
	public void eat(String sr) {
			System.out.println(sr + "먹는다");
	}
	public void showInfo(String sr) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);	
	}
	public static void main(String args[]) {
		
		Person person = new Person();
		Person.age = 20;
		String name = "홍길동";
		
		
		
	}
}
