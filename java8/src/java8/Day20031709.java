package java8;

import java.util.Scanner;

public class Day20031709 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		int result, result2;
		
		System.out.print("����, ���� :\n");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		result = num1 * num2;
		result2 = 2 * (num1 + num2);
		
		System.out.println("�簢���� ���� : " + result);
		System.out.println("�簢���� �ѷ� : " + result2);
		
		sc.close();
	}
}
