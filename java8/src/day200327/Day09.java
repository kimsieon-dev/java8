package day200327;

import java.util.Scanner;

public class Day09 {
	private static final char A = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seok = 0; 
		int jae = 0;
		int e1 = 0;
		int e2 = 0;
		char grade;
		
		do {
			if(seok < 0 || seok > 100) {
				System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�");
		}
		System.out.print("�⼮ ������ �Է��ϼ���. : ");
		seok = sc.nextInt();
		}while(seok < 0 || seok > 100 );
		
		do {
			if(jae < 0 || jae > 100) {
				System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�");
		}
		System.out.print("���� ������ �Է��ϼ���. : ");
		jae = sc.nextInt();
		}while(jae < 0 || seok > 100 );
		
		do {
			if(e1 < 0 || e1 > 100) {
				System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�");
		}
		System.out.print("�߰���� ������ �Է��ϼ���. : ");
		e1 = sc.nextInt();
		}while(e1 < 0 || e1 > 100 );
		
		do {
			if(e2 < 0 || e2 > 100) {
				System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�");
		}
		System.out.print("�⸻��� ������ �Է��ϼ���. ");
		e2 = sc.nextInt();
		}while(e2 < 0 || e2 > 100 );
		System.out.println();
		
		int res = (int)(seok / 100.0 * 20 + jae / 100.0 * 20 + e1 / 100.0 * 30 + e2 / 100.0 * 30);
		System.out.println("�� ������ : " + res + "�� �Դϴ�.");
		
		if(res >= 90) {
			grade = 'A';
		}else if(res >= 80) {
			grade = 'B';
		}else if(res >= 70) {
			grade = 'C';
		}else if(res >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println("����� ������ " + grade + "���� �Դϴ�.");
		
	}
}
