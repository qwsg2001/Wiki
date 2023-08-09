package Exam4;

//class AnimalTest{
//	static void animalsound(Animal animal) {
//		animal.sound();
//		
//	}
//}
abstract class Animal {
	// 추상 클레스 : 객체를 생성하지 못한다.
	// new x 적어도 한개의 추상 메소드를 포함해야 한다.

	String name;

	abstract void sound();

	public String getName() {
		return name;
	}
}

class Dog extends Animal {

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("강아지는 멍멍멍.. ");

	}

}

class Cat extends Animal {

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("고양이는 야옹야옹.. ");

	}

}

class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.name = "강아지";
		animal.sound();

		Cat cat = new Cat();
		cat.name = "고양이";
		cat.sound();
		/////////////////////////
		animalsound(animal);
		animalsound(cat);
		////////////////////////
	}

	private static void animalsound(Animal animal) {
		// TODO Auto-generated method stub
		
	}
}

class A지점 extends 분사{

@Override
void menu() {

		System.out.println("공기밥이 공짜로 제공됩니다.");
	}
	
}

abstract class 분사 {
	abstract void menu(); 
	
	void 비빔밥() {
		System.out.println("");
	}
}
