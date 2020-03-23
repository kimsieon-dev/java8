package day200323;

import java.util.Scanner;

public class Day14 {
	public static void main(String[] args) {
		// 구구단을 2단부터 9단까지 출력하세요.
		int i;
		int j;
		int num;
		
		System.out.println("구구단을 출력하세요.");
		for( i = 1; i <= 9; i++) {
			for( j = 2; j <= 9; j++ ) {
				System.out.print(j + " X " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		System.out.println("==========");
		// 몇단을 출력할지 입력 받아서 출력해주세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단을 출력할까요? : ");
		num = sc.nextInt();
		System.out.println(num + "단 출력");
		
		for(i=1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + (i * num) + "\t");
		}
		
	}
}
