package day200324;

import java.util.Scanner;

public class Day03 {
	public static void main(String[] args) {
		/* ������ ������� �Է� �޾Ƽ�
		 *
		 * @
		 * @@
		 * @@@
		 * @@@@
		 * @@@@@
		 * 
		 * ���� ���� ���·� ����ϼ���.
		 */
		int i;
		int j;
		int line;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����Ͻðڽ��ϱ�? : ");
		line = sc.nextInt();
		
		for (i = 0; i < line; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
