package day200326;

import java.util.Scanner;

public class Day14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int kimbab = 2000;
		final int dduk = 2000;
		final int oden = 500;
		final int sundae = 2000;
		int a, b, c, d;

		System.out.println("�޴��� ������ �����ϴ�.");
		System.out.println("��� 1�� 2000��");
		System.out.println("������ 1�κ� 2000��");
		System.out.println("���� 1�� 500��");
		System.out.println("���� 1�κ� 2000��");
		System.out.println();

		System.out.print("����� ���� �����Ͻðڽ��ϱ�? : ");
		a = sc.nextInt();
		System.out.print("�����̴� ���κ� �����Ͻðڽ��ϱ�? : ");
		b = sc.nextInt();
		System.out.print("������ � �����Ͻðڽ��ϱ�? : ");
		c = sc.nextInt();
		System.out.print("����� ���κ� �����Ͻðڽ��ϱ�? : ");
		d = sc.nextInt();
		System.out.println();
		
		System.out.println("�����" + a + "�� �ֹ��̽��ϴ�.");
		System.out.println("��� : " + kimbab * a);
		System.out.println("�����̴�" + b + "�κ� �ֹ��̽��ϴ�.");
		System.out.println("������ : " + dduk * b);
		System.out.println("������" + a + "�� �ֹ��̽��ϴ�.");
		System.out.println("���� : " + oden * c);
		System.out.println("�����" + a + "�κ� �ֹ��̽��ϴ�.");
		System.out.println("���� : " + sundae * d);
		System.out.println();
		
		System.out.println("�� �ݾ��� : " + (kimbab * a + dduk * b + oden * c + sundae * d));
		sc.close();
	}
}
