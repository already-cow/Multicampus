package chapter07.sec03;

public class ComputerRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer c1 = new Computer(10000, "Apple", 30);
		Computer c2 = new Computer(1000, "Banana", 24);

		System.out.println(c1);
		System.out.println(c2);

		Computer c3 = new Computer();
		c3.setPrice(10000);
		c3.setMaker("Samsung");
		c3.setMonitor(25);

		System.out.println(c3);

	}

}
