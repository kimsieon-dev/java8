package java8;

import java.util.Scanner;

public class Day20031707 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		
		System.out.println("�������� �Է��Ͻÿ�. ");
		int r = sc.nextInt();
		System.out.println("������ �� : ");
		
		double result = 2 * pi * r;
		System.out.println(result);
		
		System.out.println("������ �� : ");
		
		result = 2 * Math.PI * r;
		System.out.println(result);
		
		sc.close();
	}
}
