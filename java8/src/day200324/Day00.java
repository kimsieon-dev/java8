package day200324;

public class Day00 {
	public static void main(String[] args) {
		// 1 ~ 100���� ���
		int i;
		int sum = 0;
		int sub = 0;

		for (i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println("==========");

		// 1 ~ 100 �� 3�� 5�� ������� ��
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("==========");

		// 1 ~ 100 �߿� ¦���� ���ϰ� Ȧ���� �� ����� ����ϼ���
		sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			} else {
				sub += i;
			}
		}
		System.out.println("¦���� ���ϰ� Ȧ���� �A ��� : " + (sum - sub));
		System.out.println("==========");

		sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			} else {
				sum -= i;
			}
		}
		System.out.println(sum);
	}
}
