package day200320;

import java.util.Scanner;

public class Day09 {
	public static void main(String[] args) {
		int year;

		Scanner sc = new Scanner(System.in);
		System.out.print("윤년을 판단할 년도 입력 : ");
		year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년이다.");
		} else {
			System.out.println(year + "년은 윤년이 아니다."); 
		}
		sc.close();
	}
}
