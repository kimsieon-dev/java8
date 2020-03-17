package java8;

import java.util.Scanner;

public class Day20031710 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		int temp;
		
		System.out.print("입력 N : ");
		n = sc.nextInt();
		System.out.print("입력 M : ");
		m = sc.nextInt();
		
		System.out.println("교환 전 : " + "N = " + n + ", M = " + m);
		
		/* swap 코드 */
		temp = n;
		n = m;
		m = temp;
		System.out.println("교환 후 : " + "N = " + n + ", M = " + m);
		
		sc.close();
	}
}
