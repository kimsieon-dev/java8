package day200320;

import java.util.Scanner;

public class Day11 {
	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");

		Scanner sc = new Scanner(System.in);
		String mes;

		do {
			System.out.print("> ");
			mes = sc.next();
			System.out.println(mes);
		} while (!mes.equals("q"));
		System.out.println();
		System.out.println("���α׷� ����");
	}
}
