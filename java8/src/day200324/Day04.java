package day200324;

import java.util.Scanner;

public class Day04 {
	public static void main(String[] args) {
		/*
		 * ������ ������� �Է� �޾Ƽ�
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
		 * @ ���� ���� ���·� ����ϼ���.
		 */

		int line;

		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����Ͻðڽ��ϱ�?(Ȧ���� �Է�) : ");
		line = sc.nextInt();

		if (line % 2 == 0) {
			System.out.println("¦���� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
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
