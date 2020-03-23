package day200323;

import java.util.Scanner;

public class Day00 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 정수를 입력해주세요. : ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num == num2) {
			System.out.println("same 입니다." );
		}else {
			System.out.println("different 입니다.");
		}
		String result = num == num2 ? "같음" : "다름";
		System.out.println(result);
		sc.close();
	}
}
