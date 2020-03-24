package day200324;

import java.util.Scanner;

public class Day03 {
	public static void main(String[] args) {
		/* 몇줄을 출력할지 입력 받아서
		 *
		 * @
		 * @@
		 * @@@
		 * @@@@
		 * @@@@@
		 * 
		 * 위와 같은 형태로 출력하세요.
		 */
		int i;
		int j;
		int line;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 출력하시겠습니까? : ");
		line = sc.nextInt();
		
		for (i = 0; i < line; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
