package day200327;

import java.util.Scanner;

public class Day10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int num2;
		
		System.out.print("�ܰ��� �Է��ϼ���. : ");
		num = sc.nextInt();
		System.out.print("������ �Է��ϼ���. : ");
		num2 = sc.nextInt();
		System.out.println();
		
		int res = num * num2;
		System.out.println("��ǰ �ܰ� : " + num + "��");
		System.out.println("��ǰ ���� : " + num2 + "��");
		
		int sale = 0;
		if(res >= 1000000) {
			num *= 0.6;
			sale = 40;
		}else if(res >= 500000) {
			num2 *= 0.7;
			sale = 30;
		}
		
		System.out.println("������ : " + sale + "% �Դϴ�.");
		System.out.println("���� �ݾ� : " + (num * num2) + "�� �Դϴ�.");
	}
}
