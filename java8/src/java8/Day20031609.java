package java8;

import java.util.Scanner;

public class Day20031609 {
	public static void main(String[] args) {
		// Ű���� �Է��� ���� ��ü
		Scanner scanner = new Scanner(System.in);
		
		
		// Ű����� ���� �Է�
		System.out.print("�����Դϱ�?(���� : 1, �����ƴ� : 0) : ");
		int capital = scanner.nextInt();
		boolean isCapital = capital == 0 ? false : true;
		
		// Ű����� ���� �Է�
		System.out.print("�α�(���� : ��) : ");
		int citizens = scanner.nextInt();
		
		// Ű����� ���� �Է�
		System.out.print("������ �� (���� : ��) : ");
		int riches = scanner.nextInt();

		/*
		 * ��Ʈ�������� ���� �Ǵ�
		 * 1. �� ������ �����̰� �α��� 100�� �̻��̾�� �Ѵ�. (���� ������)
		 * 2. �� �ҵ��� 1�� �̻��� �α��� 50�� �̻��̿��� �Ѵ�. (���� ������)
		 */
		
		// 1.
		boolean isMetro1 = isCapital && (citizens > 100);
		// 2.
		boolean isMetro2 = riches >= 50;
		
		boolean isMetro = isMetro1 || isMetro2;
		System.out.println("��Ʈ�������� ���� : " + isMetro);
		
	}
}
