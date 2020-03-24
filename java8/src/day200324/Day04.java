package day200324;

import java.util.Scanner;

public class Day04 {
	public static void main(String[] args) {
		/*
		 * 몇줄을 출력할지 입력 받아서
		 *
		 * @
		 * 
		 * @@
		 * 
		 * @@@
		 * 
		 * @@@@
		 * 
		 * @@@@@
		 * 
		 * @@@@
		 * 
		 * @@@
		 * 
		 * @@
		 * 
		 * @ 위와 같은 형태로 출력하세요.
		 */

		int line;

		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 출력하시겠습니까?(홀수만 입력) : ");
		line = sc.nextInt();

		if (line % 2 == 0) {
			System.out.println("짝수를 입력하셨습니다. 프로그램을 종료합니다.");
			System.exit(0);
		}

		int i;
		int j;
		int upline = line / 2;
		int downline = line - upline;

		for (i = 0; i < upline; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}

		for (i = downline; i > 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
