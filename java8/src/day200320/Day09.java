package day200320;

import java.util.Scanner;

public class Day09 {
	public static void main(String[] args) {
		int year;

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Ǵ��� �⵵ �Է� : ");
		year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "���� �����̴�.");
		} else {
			System.out.println(year + "���� ������ �ƴϴ�."); 
		}
		sc.close();
	}
}
