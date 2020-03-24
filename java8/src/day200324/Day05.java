package day200324;

import java.util.Random;
import java.util.Scanner;

public class Day05 {
	public static void main(String[] args) {
		// ������ ���� 10ȸ �Ϸ�� ���� �ð��� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int i;
		int num;
		int num2;
		int answer;
		int quiz;
		long startTime;
		long endTime;
		
		startTime = System.currentTimeMillis();
		for (i = 0; i < 10; i++) { // 10���� �ݺ�
			num = (int)(Math.random() * 8) + 2;
			num2 = rd.nextInt(9) + 1;
			
			quiz = num * num2;
			
			System.out.print(i + 1 + "�� : " + num + " X " + num2 + " = ");
			answer = sc.nextInt();
			
			if(quiz == answer) {
				System.out.println("�����Դϴ�.");
				System.out.println();
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�. ������ �����ϰڽ��ϴ�.");
				System.exit(0);
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("���� ���� �ð�");
		System.out.println(endTime - startTime + "ms");
	}
}
