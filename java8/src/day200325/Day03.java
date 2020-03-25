package day200325;

import java.util.Scanner;

public class Day03 {
	public static void main(String[] args) {
		// 구구단 게임
		System.out.println("구구단을 시작하겠습니다.");

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int answer;
		int res;
		int subscore = 0;

		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 10; i++) {
			a = (int) (Math.random() * 9 + 1);
			b = (int) (Math.random() * 8 + 2);
			res = a * b;

			System.out.print(b + " X " + a + " = ");
			answer = sc.nextInt();

			if (res == answer) {
				System.out.println("정답입니다.");
				System.out.println();
			} else {
				subscore += 5;
				System.out.println("틀렸습니다." + subscore + "점 감점입니다.");
				System.out.println();
			}

		}
		long endTime = System.currentTimeMillis();
		long playTime = endTime - startTime / 1000;
		long score = 200 - playTime - subscore;
		
		if(score > 100) {
			score = 100;
		}else if(score < 0) {
			score = 0;
		}
		System.err.println("최종 점수는 " + score + "점 입니다.");

	}
}
