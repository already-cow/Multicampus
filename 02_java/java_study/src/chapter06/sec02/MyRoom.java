package chapter06.sec02;

public class MyRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new Phone();
		p1.doInternet();
		p1.color = "검정";
		p1.shape = "폴더";

		Phone p2 = new Phone();
		p2.Kakao();
		p2.color = "빨강";
		p2.shape = "네모";

		System.out.println(p2.color);
		System.out.println(p2.shape);
	}

}