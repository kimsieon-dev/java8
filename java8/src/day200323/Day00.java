package day200323;

import java.util.Scanner;

public class Day00 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ΰ��� ������ �Է����ּ���. : ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num == num2) {
			System.out.println("same �Դϴ�." );
		}else {
			System.out.println("different �Դϴ�.");
		}
		String result = num == num2 ? "����" : "�ٸ�";
		System.out.println(result);
		sc.close();
	}
}
