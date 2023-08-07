package java_study.chapter05;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] jumsu = new int[1000]; // 배열 초기화
		System.out.println(jumsu);

		jumsu[0] = 100;
		jumsu[10] = 200;
		jumsu[999] = 1000;

		System.out.println("첫번째 값" + jumsu[0]);
		System.out.println("11번째 값" + jumsu[10]);
		System.out.println("마지막 값" + jumsu[999]);
		System.out.println("500번째 값" + jumsu[499]);

		for (int i = 0; i < jumsu.length; i++) { // 인덱스 기반, .length(상수)
			System.out.println(i + ":" + jumsu[i]);
		}

		int sum = 0;
		for (int value : jumsu) {
			System.out.println(value);
			sum += value;
		}
	}

}
