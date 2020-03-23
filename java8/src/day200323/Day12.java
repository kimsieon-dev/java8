package day200323;

import java.util.Scanner;

public class Day12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է����ּ���. : ");
		int line = sc.nextInt();

		// ¦����� ����
		if (line % 2 == 0) {
			System.out.println("¦���� ������� �ʽ��ϴ�. �����մϴ�.");
			System.exit(0);
		}
		
		int upline = line / 2;
		int downline = line - upline;
		int i;
		int j;
		
		for(i = 0; i < upline; i++) {
			for(j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i = downline; i > 0; i--) {
			for(j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
