package day200325;

import java.util.Scanner;

public class Day03 {
	public static void main(String[] args) {
		// ������ ����
		System.out.println("�������� �����ϰڽ��ϴ�.");

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int answer;
		int res;
		int subscore = 0;

		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 10; i++) {
			a = (int) (Math.random() * 9 + 1);
			b = (int) (Math.random() * 8 + 2);
			res = a * b;

			System.out.print(b + " X " + a + " = ");
			answer = sc.nextInt();

			if (res == answer) {
				System.out.println("�����Դϴ�.");
				System.out.println();
			} else {
				subscore += 5;
				System.out.println("Ʋ�Ƚ��ϴ�." + subscore + "�� �����Դϴ�.");
				System.out.println();
			}

		}
		long endTime = System.currentTimeMillis();
		long playTime = endTime - startTime / 1000;
		long score = 200 - playTime - subscore;
		
		if(score > 100) {
			score = 100;
		}else if(score < 0) {
			score = 0;
		}
		System.err.println("���� ������ " + score + "�� �Դϴ�.");

	}
}
