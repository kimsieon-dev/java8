package day200324;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Day06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int min = 0;
		int max = 0;
		int sum = 0;

		System.out.print("a와 b의 값을 입력하세요. : ");
		a = sc.nextInt();
		b = sc.nextInt();

		if (!(a >= -10_000_000 && a <= 10_000_000)) {
			System.out.println("a값의 입력 범위를 초과하였습니다.");
			System.exit(0);
		}
		if (!(b >= -10_000_000 && b <= 10_000_000)) {
			System.out.println("b값의 입력 범위를 초과하였습니다.");
			System.exit(0);
		}
		if (a > b) {
			max = a;
			min = b;
		} else if (a == b) {
			System.out.println("a부터 b까지의 합 : " + a);
			System.exit(0);
		} else {
			min = a;
			max = b;
		}
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println("a부터 b까지의 합 : " + sum);
	}
}
