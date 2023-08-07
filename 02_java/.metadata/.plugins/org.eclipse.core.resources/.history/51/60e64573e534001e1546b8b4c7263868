package java_study.chapter04;

import java.util.Date;

public class TimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동 import : 컨트롤 + shift + b
		Date date = new Date(); // class 이름은 같으나 package 다름
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.printf("%d시 %d분 %d초 \n", hour, min, sec);

		int year = date.getYear();
		int month = date.getMonth() + 1; // 월은 0부터 시작
		int today = date.getDate();
		System.out.println(year + 1900 + "년 " + month + "월 " + today + "일");

		// 2023-08-01 11:20:30 format은
		System.out.printf("%d-%02d-%02d %02d:%02d:%02d\n", year + 1900, month, today, hour, min, sec);
	}

}
