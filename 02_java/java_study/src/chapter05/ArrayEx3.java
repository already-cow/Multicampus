package chapter05;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[2]; // 참조형 null 4byte
		names[0] = "홍길동";
		names[1] = "김길동";
		for (String x : names) {
			System.out.println(x);
		}
		System.out.println("개수: " + names.length);

		String[] names2;
		names2 = new String[] { "a", "b" }; // new String[] 필수
		System.out.println(names[0].length());
		String s = "홍길동";
		System.out.println(s.charAt(0));
	}

}
