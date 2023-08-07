package chapter04;

public class PrintEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value = 12.345678;
		String result = "작은 값";

		// 데이터가 2개 이상일 때 사용
		System.out.printf("계산 결과는 %f 입니다. \n", value);
		System.out.printf("계산 결과는 %.3f 입니다. \n", value);
		System.out.printf("%s의 값은 %.2f 입니다. \n", result, value);
	}

}
