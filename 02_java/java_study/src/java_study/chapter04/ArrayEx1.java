package java_study.chapter04;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] height = { 123.4, 234.2, 124.5 }; // height 배열
		double[] space = new double[500]; // double 배열 : 500개의 공간
		char[] gender = { '남', '여', '남' }; // char 배열
		String[] space2 = new String[333]; // 값을 모름. 333개 공간

		System.out.println(space); // [D@3d012ddd
		System.out.println(space[0]);
		System.out.println(space2);
		System.out.println(space2[0]);
	}

}
