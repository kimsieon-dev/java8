package day200324;

import java.util.Scanner;

public class Day01 {
	public static void main(String[] args) {
		// Hello, World 0 ~ 9 10�� ���
		int i;
		int j;

		for (i = 1; i <= 10; i++) {
			System.out.println("Hellow, World " + i);
		}
		System.out.println("==========");

		// Hello, World 0 ~ 9 10�� ��������
		for (i = 9; i >= 0; i--) {
			System.out.println("Hellow, World " + i);
		}
		System.out.println("==========");

		// ����̸� 5���� 7�� ���
		for (i = 0; i < 7; i++) {
			System.out.println("@@@@@");
		}
		System.out.println("==========");

		// ���� ��¹��� ��ø for������ �����ϼ���.
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println("==========");

		// ���� ��¹����� 2���� 4���� #�� �ǵ��� �����ϼ���.
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
		
		// ���ڿ��� �Է¹޾Ƽ� for ������ ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է����ּ���.");
		System.out.print("�Է� > ");
		String str = sc.nextLine();
		
		for (i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}
