package day200327;

import java.util.Scanner;

public class Day08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("두 개의 정수를 입력하세요. : ");
			int num = sc.nextInt();
			int num2 = sc.nextInt();
			int res = num * num2;

			System.out.println(num + " X " + num2 + " = " + res);

			if (num * num2 >= 500) {
				break;
			}
		}
		System.out.println("500을 초과했습니다. 중단하겠습니다.");
	}
}
