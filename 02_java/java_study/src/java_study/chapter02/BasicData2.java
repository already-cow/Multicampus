package java_study.chapter02;

public class BasicData2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 리터럴 데이터 : 값을 직접 작성한 것 (데이터 타입이 있다)
		byte age = 100;
		short wallet = 20000;
		int money = 5000000;
		long space = 1000000000000L; // L이나 l 이 없으면 int
		System.out.println("내 은행에 든 돈 :" + money + "원");

		// 실수 -> double
		double height = 185.5;
		float weight = 88.8f; // F나 f 없으면 double
		System.out.println("내 키는 :" + height);

		char gender = '남'; // char는 작은 따옴표
		System.out.println("내 성별은 : " + gender);

		String name = "홍길동";
		System.out.println("내 이름은 : " + name);
	}

}
