package chapter08.sec03;

public class ChildEx {
	static void run(Parent p) {

	}

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child);

		Parent parent = child;
		System.out.println(parent);

		run(child);

		parent.method1();
		parent.method2();

	}
}
