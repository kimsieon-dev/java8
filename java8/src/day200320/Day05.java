package day200320;

import java.util.Scanner;

public class Day05 {
	public static void main(String[] args) {
		/*
		 * �� ���� ������� �Է� �޾Ƽ� ȭ�鿡 ����ϴ� ���α׷��� �ۼ��ϼ���.
		 */

		int num;
		int i;

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		num = sc.nextInt();

		for (i = 1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
		sc.close();
	}
}