package day200323;

import java.util.Scanner;

public class Day01 {
	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("한개의 정수를 입력하세요. : ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		sc.close();
	}
}
