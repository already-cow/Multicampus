package chapter03;

public class inputTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 4;

		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2); // 정수/정수 = 정수
		System.out.println(n1 / 4.0); // 정수/실수 = 실수

		System.out.println((double) n1 / n2); // 타입연산자 먼저
		System.out.println((double) (n1 / n2)); // 식 먼저
	}

}
