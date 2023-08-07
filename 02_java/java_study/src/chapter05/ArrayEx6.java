package chapter05;

import java.util.Scanner;

public class ArrayEx6 {
	// SRP (Single Responsibility Principal) : 단일 책임의 원칙
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] jumsu = new int[5];

		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("점수 >> ");
			jumsu[i] = sc.nextInt();
		}

		for (int x : jumsu) {
			System.out.println(x + " ");
		}
		System.out.println();

		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x;
		}

		System.out.println("전체합계: " + sum);
		double avg = (double) sum / jumsu.length;
		System.out.println("전체평균: " + avg);

		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] > 300) {
				sum2 = sum2 + jumsu[i];
			}
		}
		System.out.println("300이상 되는 합계: " + sum2);

		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				System.out.println("300인 값이 저장된 인덱스: " + i);
			}
		}
	}

}
