package day200320;

import java.util.Scanner;

public class Day11 {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		Scanner sc = new Scanner(System.in);
		String mes;

		do {
			System.out.print("> ");
			mes = sc.next();
			System.out.println(mes);
		} while (!mes.equals("q"));
		System.out.println();
		System.out.println("프로그램 종료");
	}
}
