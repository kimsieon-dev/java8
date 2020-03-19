package java8;

import java.util.Scanner;

public class Day20031908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴입니다.");
		System.out.println("A.아메리카노, C.카푸치노, L.카페라떼, M.카페모카 입니다.");
		System.out.print("커피를 골라주세요. : ");
		String coffee = sc.next();

		switch (coffee) {
		case "a":
		case "A":
			System.out.println("아메리카노");
			break;
		case "c":
		case "C":
			System.out.println("카푸치노");
			break;
		case "l":
		case "L":
			System.out.println("카페라떼");
			break;
		case "m":
		case "M":
			System.out.println("카페모카");
			break;
		}
		sc.close();
	}
}
