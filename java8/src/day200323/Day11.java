package day200323;

import java.util.Scanner;

public class Day11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����Ͻðڽ��ϱ�? : ");
		int line = sc.nextInt();

		for (int i = line; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (j % 2 == 0) {
					System.out.print("$");
				} else {
					System.out.print("\\");
				}
			}
			System.out.println();
		}
		System.out.println("==========");

		for (int i = line; i > 0; i--) {
			System.out.println(i);
		}
	}
}
