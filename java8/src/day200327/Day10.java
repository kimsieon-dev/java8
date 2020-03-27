package day200327;

import java.util.Scanner;

public class Day10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int num2;
		
		System.out.print("단가를 입력하세요. : ");
		num = sc.nextInt();
		System.out.print("수량을 입력하세요. : ");
		num2 = sc.nextInt();
		System.out.println();
		
		int res = num * num2;
		System.out.println("상품 단가 : " + num + "원");
		System.out.println("상품 수량 : " + num2 + "개");
		
		int sale = 0;
		if(res >= 1000000) {
			num *= 0.6;
			sale = 40;
		}else if(res >= 500000) {
			num2 *= 0.7;
			sale = 30;
		}
		
		System.out.println("할인율 : " + sale + "% 입니다.");
		System.out.println("지불 금액 : " + (num * num2) + "원 입니다.");
	}
}
