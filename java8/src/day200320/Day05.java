package day200320;

import java.util.Scanner;

public class Day05 {
	public static void main(String[] args) {
		/*
		 * 몇 단을 출력할지 입력 받아서 화면에 출력하는 프로그램을 작성하세요.
		 */

		int num;
		int i;

		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		num = sc.nextInt();

		for (i = 1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
		sc.close();
	}
}