package day200324;

import java.util.Random;
import java.util.Scanner;

public class Day02 {
	public static void main(String[] args) {
		// ������ ����ؼ� ������ ������ ����ϰ� ���� �Է��ϵ��� �ۼ��ϼ���.
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int num;
		int num2;
		int quiz;
		int answer;
		int i;
		
		long startTime = System.currentTimeMillis();
		// System.out.println(startTime);
		for (i = 0; i < 10; i++) {
			num = (int) (Math.random() * 8) + 2;
			num2 = rd.nextInt(9) + 1;

			quiz = num * num2;

			System.out.print(num + " X " + num2 + " = ");
			answer = sc.nextInt();

			if (quiz == answer) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�. ������ �����մϴ�.");
				System.exit(0);
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("[���� ���� �ð�]");
		System.out.println(endTime - startTime + "ms");
		
	}
}
