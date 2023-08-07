package chapter06.sec01;

public class CarUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();

		car1.color = "검정색";
		System.out.println(car1.color);
		car1.run();

		Car car2 = new Car();
		car2.color = "빨강색";
		System.out.println(car2.color);
		car2.run();
	}

}
