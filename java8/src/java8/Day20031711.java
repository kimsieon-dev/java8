package java8;

import java.util.Scanner;

public class Day20031711 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
			
		System.out.print("�Է� a : ");
		a = sc.nextInt();
		System.out.print("�Է� b : ");
		b = sc.nextInt();
		
		String stra = "a(" + a + ")";
		String strb = "b(" + b + ")";
		System.out.println("�Է� : " + stra + ", " + strb);
		
		String result = a >= b ? stra : strb; 
		System.out.println("��� : " + result);
			
	}
}
