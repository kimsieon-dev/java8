package day200323;

import java.util.Scanner;

public class Day14 {
	public static void main(String[] args) {
		// �������� 2�ܺ��� 9�ܱ��� ����ϼ���.
		int i;
		int j;
		int num;
		
		System.out.println("�������� ����ϼ���.");
		for( i = 1; i <= 9; i++) {
			for( j = 2; j <= 9; j++ ) {
				System.out.print(j + " X " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		System.out.println("==========");
		// ����� ������� �Է� �޾Ƽ� ������ּ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ����ұ��? : ");
		num = sc.nextInt();
		System.out.println(num + "�� ���");
		
		for(i=1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + (i * num) + "\t");
		}
		
	}
}
