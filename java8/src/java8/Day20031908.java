package java8;

import java.util.Scanner;

public class Day20031908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴��Դϴ�.");
		System.out.println("A.�Ƹ޸�ī��, C.īǪġ��, L.ī���, M.ī���ī �Դϴ�.");
		System.out.print("Ŀ�Ǹ� ����ּ���. : ");
		String coffee = sc.next();

		switch (coffee) {
		case "a":
		case "A":
			System.out.println("�Ƹ޸�ī��");
			break;
		case "c":
		case "C":
			System.out.println("īǪġ��");
			break;
		case "l":
		case "L":
			System.out.println("ī���");
			break;
		case "m":
		case "M":
			System.out.println("ī���ī");
			break;
		}
		sc.close();
	}
}
