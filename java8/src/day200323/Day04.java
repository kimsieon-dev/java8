package day200323;

public class Day04 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for(i = 1; i <= 50; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1���� 50���� �� 3�� ����� �� : " + sum + " �Դϴ�.");
	}
}
