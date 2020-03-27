package day200326;

import java.util.Random;
import java.util.Scanner;

public class Day16 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] com = new int[3];

		com[0] = rd.nextInt(9) + 1;

		do {
			com[1] = rd.nextInt(9) + 1;
		} while (com[0] == com[1]);

		do {
			com[2] = rd.nextInt(9) + 1;
		} while (com[0] == com[2] || com[1] == com[2]);

		Scanner sc = new Scanner(System.in);
		int[] user = new int[3];

		int strike = 0;
		int ball = 0;

		for (int x = 0; x < 11; x++) {
			/* 유저 입력 부분 */
			System.out.print("첫 번째 값을 입력해주세요.(1 ~ 9) : ");
			do {
				if (user[0] != 0) {
					System.out.println("잘못 입력하셨습니다.");
				}
				user[0] = sc.nextInt();
			} while (user[0] < 1 || user[0] > 9);

			do {
				if (user[0] == user[1]) {
					System.out.println("동일한 숫자는 입력할 수 없습니다.");
				}
				System.out.print("두 번째 값을 입력해주세요.(1 ~ 9) : ");
				do {
					if (user[1] != 0) {
						System.out.println("잘못 입력하셨습니다.");
					}
					user[1] = sc.nextInt();
				} while (user[1] < 1 || user[1] > 9);
			} while (user[0] == user[1]);

			do {
				if (user[0] == user[2] || user[1] == user[2]) {
					System.out.println("동일한 숫자는 입력할 수 없습니다.");
				}
				System.out.print("세 번째 값을 입력해주세요.(1 ~ 9) : ");
				do {
					if (user[2] != 0) {
						System.out.println("잘못 입력하셨습니다.");
					}
					user[2] = sc.nextInt();
				} while (user[2] < 1 || user[2] > 9);
			} while (user[0] == user[2] || user[1] == user[2]);

			for (int i = 0; i < 3; i++) {

				if (com[i] == user[i]) {
					strike++;
				}
			}
			if (com[0] == user[1] || com[0] == user[2]) {
				ball++;
			}
			if (com[1] == user[0] || com[1] == user[2]) {
				ball++;
			}
			if (com[2] == user[0] || com[2] == user[1]) {
				ball++;
			}

			System.out.println(strike + " strike " + ball + " ball");
			if (strike == 3) {
				System.out.println("정답입니다. 게임을 종료합니다.");
				System.exit(0);
			}
			strike = ball = 0;
			for (int i = 0; i < user.length; i++) {
				user[i] = 0;
			}
		}

	}
}
