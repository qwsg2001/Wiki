package day03;

public class Person {

	String name, sex, tal; //has-a
	int age;
	
	// 생성자
	//객체 생성시 호출
	//1. 반드시 public 접근자
	//2. 반환타입없다
	//3. 클래스 이름과 동일하다
	public Person() {
		
	}
	
	// 인자 생성자...
	public Person(String name, int age, String sex, String tal) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.tal = tal;
	}
	public String showProfile() {
		String info="---"+name+" 프로필---";
		info+="\n나이 : "+age;
		info+="\n성별 : "+sex;
		info+="\n전화 : "+tal;
		return info;
	}
	
	public void wantJob(String jop, int pay) {
		System.out.println("---"+name+"---");
		System.out.println("희망직종 : "+jop);
		System.out.println("희망연봉 : "+pay);
	}
	// 동적 메소드
	public void eat() {
		System.out.println("먹다");
	}
	public void smile() {
		System.out.println("웃다");
	}
	
}
