package java_study.chapter04;

import java.util.Random;
import java.util.Scanner;

// 0:가위 1:바위 2:보 게임
public class Game1 {
	public static void main(String[] args) {
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		final int EXIT = -1;

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int mewin = 0;
		int comwin = 0;
		int draw = 0;

		while (true) {
			int computer = r.nextInt(3); // 3은 미포함
			System.out.print("0:가위 1:바위 2:보 -1:종료 >> ");
			int me = sc.nextInt();

			// 종료 조건 확인 후 진행
			if (me == EXIT) { // 종료 조건
				int sum = mewin + comwin;
				double result = (double) mewin / sum * 100;
				System.out.println("이긴 횟수");
				System.out.println("나의 이긴 횟수 : " + mewin + "회");
				System.out.println("컴퓨터의 이긴 횟수 : " + comwin + "회");
				System.out.println("비긴 횟수 : " + draw + "회");
				System.out.println("승률 : " + result + "%");
				System.out.println("게임을 끝냅니다.");
				break;
			}

			System.out.printf("컴퓨터 : %d, 나 : %d\n", computer, me);

			if (me == computer) { // 비긴 것
				draw++;
				System.out.println("비겼습니다.");
			} else if ((me == SCISSORS && computer == PAPER) || (me == ROCK && computer == SCISSORS)
					|| (me == PAPER && computer == ROCK)) { // 내가 이긴 경우
				mewin++;
				System.out.println("내가 이겼습니다.");
			} else if (me > 3) {
				System.out.println("다시 입력 해주세요.");

			} else { // 내가 진 경우
				comwin++;
				System.out.println("내가 졌습니다.");
			}
		}
	}
}