package java8;

import java.util.Scanner;

public class Day20031710 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		int temp;
		
		System.out.print("�Է� N : ");
		n = sc.nextInt();
		System.out.print("�Է� M : ");
		m = sc.nextInt();
		
		System.out.println("��ȯ �� : " + "N = " + n + ", M = " + m);
		
		/* swap �ڵ� */
		temp = n;
		n = m;
		m = temp;
		System.out.println("��ȯ �� : " + "N = " + n + ", M = " + m);
		
		sc.close();
	}
}
