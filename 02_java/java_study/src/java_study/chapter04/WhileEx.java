package java_study.chapter04;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.printf("1~ %d 합 : %d", i - 1, sum);
	}

}
