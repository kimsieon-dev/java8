package day200323;

public class Day13 {
	public static void main(String[] args) {
		// 1 ~ 100 �� 5�� ����� ���� ����ϼ���.

		int i;
		int sum = 0;
		int count = 0;

		for (i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("5�� ����� ���� : " + sum + " �Դϴ�.");
		System.out.println("==========");

		// 1 ~ 50 �� 3�� ����� ȭ�鿡 ����ϼ���.
		for (i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("==========");
		
		// 1 ~ 50 �� 3�� ����� �� �հ� ������ ����ϼ���.
		sum = 0;
		for( i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("3�� ����� ���� : " + sum + " �Դϴ�.");
		System.out.println("3�� ����� ������ : " + count + "�� �Դϴ�.");
	}
}
