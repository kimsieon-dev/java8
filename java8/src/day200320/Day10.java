package day200320;

import java.util.Scanner;

public class Day10 {
	public static void main(String[] args) {
		int value;
		int resvalue = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���! : ");
		value = sc.nextInt();

		while (value > 0) {
			resvalue = resvalue * 10;
			resvalue = resvalue + (value % 10);
			value /= 10;
		}
		System.out.println("�ٲ� ���� : " + resvalue);
		sc.close();
	}
}
