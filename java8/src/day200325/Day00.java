package day200325;

import java.util.Scanner;

public class Day00 {
	public static void main(String[] args) {
		/*
		 * 1 ~ 100 �� �������� ������ �����Ѵ�. �Է��� ���� ���亸�� ũ�� "up" �Է��� ���� ���亸�� ������ "down" ���� ����մϴ�.
		 * �� Ƚ���� 10ȸ�� �����մϴ�. ������ ��Ҹ� ���� ������ ���
		 */
		
		// ���� ����
		int number = (int) (Math.random() * 100) + 1; // 0 ~ 99 + 1
		int inputNum = 0;
		int cnt = 0;

		Scanner sc = new Scanner(System.in);
		
		// ���� ����
		long startTime = System.currentTimeMillis();
		
		while(true) {
			
		// �����Է�
		do {
			if (inputNum != 0) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println();
			}
			System.out.print("���ڸ� �Է����ּ���.(1 ~ 100) : ");
			inputNum = sc.nextInt();
		} while (inputNum < 1 || inputNum > 100);
			
			// ������
			cnt++;;
			if (number == inputNum) {
				System.out.println("�����Դϴ�. " + cnt + "ȸ �Է��ϼ̽��ϴ�.");
				break;
			} else if (number > inputNum) {
				System.out.println("up " + cnt + "ȸ �Է��ϼ̽��ϴ�");
			} else {
				System.out.println("down " + cnt + "ȸ �Է��ϼ̽��ϴ�.");
			}
			if(cnt == 10) {
				System.out.println("���� ������ 0���Դϴ�. ������ �����մϴ�.");
				System.exit(0);
			}
		}
		
		// �������
		long endTime = System.currentTimeMillis();
		long playTime = (endTime - startTime) / 1000; // �и��� -> ��
		double score = (60 - playTime) / 0.6;
		System.out.println("���� ������ " + score + "�� �Դϴ�. ������ �����մϴ�.");
	}
}
