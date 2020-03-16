package java8;

import java.util.Scanner;

public class Day20031609 {
	public static void main(String[] args) {
		// 키보드 입력을 위한 객체
		Scanner scanner = new Scanner(System.in);
		
		
		// 키보드로 값을 입력
		System.out.print("수도입니까?(수도 : 1, 수도아님 : 0) : ");
		int capital = scanner.nextInt();
		boolean isCapital = capital == 0 ? false : true;
		
		// 키보드로 값을 입력
		System.out.print("인구(단위 : 만) : ");
		int citizens = scanner.nextInt();
		
		// 키보드로 값을 입력
		System.out.print("부자의 수 (단위 : 만) : ");
		int riches = scanner.nextInt();

		/*
		 * 메트로폴리스 여부 판단
		 * 1. 한 나라의 수도이고 인구가 100만 이상이어야 한다. (관계 연산자)
		 * 2. 연 소득이 1억 이상인 인구가 50만 이상이여야 한다. (관계 연산자)
		 */
		
		// 1.
		boolean isMetro1 = isCapital && (citizens > 100);
		// 2.
		boolean isMetro2 = riches >= 50;
		
		boolean isMetro = isMetro1 || isMetro2;
		System.out.println("메트로폴리스 여부 : " + isMetro);
		
	}
}
