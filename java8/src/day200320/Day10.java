package day200320;

import java.util.Scanner;

public class Day10 {
	public static void main(String[] args) {
		int value;
		int resvalue = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요! : ");
		value = sc.nextInt();

		while (value > 0) {
			resvalue = resvalue * 10;
			resvalue = resvalue + (value % 10);
			value /= 10;
		}
		System.out.println("바뀐 숫자 : " + resvalue);
		sc.close();
	}
}
