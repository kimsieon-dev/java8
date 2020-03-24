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

		System.out.print("a�� b�� ���� �Է��ϼ���. : ");
		a = sc.nextInt();
		b = sc.nextInt();

		if (!(a >= -10_000_000 && a <= 10_000_000)) {
			System.out.println("a���� �Է� ������ �ʰ��Ͽ����ϴ�.");
			System.exit(0);
		}
		if (!(b >= -10_000_000 && b <= 10_000_000)) {
			System.out.println("b���� �Է� ������ �ʰ��Ͽ����ϴ�.");
			System.exit(0);
		}
		if (a > b) {
			max = a;
			min = b;
		} else if (a == b) {
			System.out.println("a���� b������ �� : " + a);
			System.exit(0);
		} else {
			min = a;
			max = b;
		}
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println("a���� b������ �� : " + sum);
	}
}
