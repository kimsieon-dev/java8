package day200324;

import java.util.Scanner;

public class Day01 {
	public static void main(String[] args) {
		// Hello, World 0 ~ 9 10줄 출력
		int i;
		int j;

		for (i = 1; i <= 10; i++) {
			System.out.println("Hellow, World " + i);
		}
		System.out.println("==========");

		// Hello, World 0 ~ 9 10줄 역순으로
		for (i = 9; i >= 0; i--) {
			System.out.println("Hellow, World " + i);
		}
		System.out.println("==========");

		// 골뱅이를 5개씩 7줄 출력
		for (i = 0; i < 7; i++) {
			System.out.println("@@@@@");
		}
		System.out.println("==========");

		// 위의 출력문을 중첩 for문으로 변경하세요.
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println("==========");

		// 위의 출력물에서 2열과 4열이 #이 되도록 변경하세요.
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 5; j++) {
				if (j % 2 == 0) {
					System.out.print("@");
				}else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		System.out.println("==========");
		
		// 문자열을 입력받아서 for 문으로 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		System.out.print("입력 > ");
		String str = sc.nextLine();
		
		for (i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}
