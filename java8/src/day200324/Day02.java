package day200324;

import java.util.Random;
import java.util.Scanner;

public class Day02 {
	public static void main(String[] args) {
		// 난수를 사용해서 구구단 문제를 출력하고 답을 입력하도록 작성하세요.
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int num;
		int num2;
		int quiz;
		int answer;
		int i;
		
		long startTime = System.currentTimeMillis();
		// System.out.println(startTime);
		for (i = 0; i < 10; i++) {
			num = (int) (Math.random() * 8) + 2;
			num2 = rd.nextInt(9) + 1;

			quiz = num * num2;

			System.out.print(num + " X " + num2 + " = ");
			answer = sc.nextInt();

			if (quiz == answer) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("틀렸습니다. 게임을 종료합니다.");
				System.exit(0);
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("[게임 진행 시간]");
		System.out.println(endTime - startTime + "ms");
		
	}
}
