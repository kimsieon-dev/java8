package day200324;

import java.util.Scanner;

public class Day07 {
	public static void main(String[] args) {
		/*
		 * 두 수를 입력 받아서 두 수의 최대 공약수와 최소 공배수를 출력하세요.
		 * 두 수의 곱은 최대 공약수 x 최소 공배수
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a값을 입력하세요. : ");
		int a = sc.nextInt();
		System.out.print("b값을 입력하세요. : ");
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
		System.out.println("최소 공배수는 : " + res + ", 최대 공약수는 " + res2);
	}
}
