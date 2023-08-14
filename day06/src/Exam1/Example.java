package Exam1;

public class Example {

	public static void action(A a) {
		// TODO Auto-generated method stub
		a.method1();

		if (a instanceof C c) {
			((C) a).method2();
		}
	}

	public static void main(String[] args) {
		A a = new A();

		action(a);
		action(new B());
		action(new C());

	}
}
