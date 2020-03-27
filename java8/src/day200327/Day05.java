package day200327;

import java.util.Random;
import java.util.Scanner;

public class Day05 {
	public static void main(String[] args) {
		/*
		 * �ζ� ������ 
		 * 1. 6���� ������ ����(1~45)�� �迭�� �Է��ϼ���. 
		 * 2. �ߺ����� �ʵ��� �ۼ�
		 */

		int[] lotto = new int[6];
		Random rd = new Random();
		System.out.println("�ζ� ������");
		System.out.print("�� ������ �����Ͻðڽ��ϱ�? : ");
		
		Scanner sc = new Scanner(System.in);
		int game = sc.nextInt();

		for(int x = 0; x < game; x++) {
		/* �ζ� ���� ���� */
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		/*
		 * ���������� ����ؼ� �迭�� ������������ �����ϼ���.
		 */
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - 1; j++) {
				if (lotto[i] < lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		/* �ζ� ���� �� */
		}
	}
}
