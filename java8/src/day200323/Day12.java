package day200323;

import java.util.Scanner;

public class Day12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 입력해주세요. : ");
		int line = sc.nextInt();

		// 짝수라면 종료
		if (line % 2 == 0) {
			System.out.println("짝수는 허용하지 않습니다. 종료합니다.");
			System.exit(0);
		}
		
		int upline = line / 2;
		int downline = line - upline;
		int i;
		int j;
		
		for(i = 0; i < upline; i++) {
			for(j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i = downline; i > 0; i--) {
			for(j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
