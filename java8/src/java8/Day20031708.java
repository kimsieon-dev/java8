package java8;

import java.util.Scanner;

public class Day20031708 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("�̸�, �й�, ���������� �Է��ϼ���.");
		String name = sc.nextLine();
		int hakbun = sc.nextInt();
		int en = sc.nextInt();
		
		System.out.println("���� �̸��� " + name + "�Դϴ�.");
		System.out.println("�й��� " + hakbun + "�Դϴ�.");
		System.out.println("�׸��� ���������� " + en + "�� �Դϴ�.");
		
		sc.close();
	}
}
