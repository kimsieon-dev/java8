package day200324;

import java.util.Scanner;

public class Day07 {
	public static void main(String[] args) {
		/*
		 * �� ���� �Է� �޾Ƽ� �� ���� �ִ� ������� �ּ� ������� ����ϼ���.
		 * �� ���� ���� �ִ� ����� x �ּ� �����
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a���� �Է��ϼ���. : ");
		int a = sc.nextInt();
		System.out.print("b���� �Է��ϼ���. : ");
		int b = sc.nextInt();
		
		int res = 0;
		int res2 = 0;
		
		for(int i = 1; i <= Integer.MAX_VALUE; i++) {
			if(i % a == 0 && i % b == 0) {
				res = i;
				break;
			}
		}
		res2 = a * b / res;
		System.out.println("�ּ� ������� : " + res + ", �ִ� ������� " + res2);
	}
}
