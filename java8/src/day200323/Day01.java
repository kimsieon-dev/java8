package day200323;

import java.util.Scanner;

public class Day01 {
	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ѱ��� ������ �Է��ϼ���. : ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ���Դϴ�.");
		}
		sc.close();
	}
}
