package day200323;

public class Day03 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		// ¦���� ��
		for(i = 1; i<=10; i++) {
			if(i % 2 == 0) { 
				sum += i;
				
		/* 
		 * Ȧ���� ��
		 * for(i = 1; i <= 10; i++) {
		 * 	if(i % 2 != 0) {
		 * 		continue;
		 * 	}
		 * sum += i;
		 * }
		 */
			}
		}
		System.out.println("1���� 10���� �� ¦���� ���� : " + sum + (" �Դϴ�."));
	}
}
