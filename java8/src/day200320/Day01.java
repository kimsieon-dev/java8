package day200320;

public class Day01 {
	public static void main(String[] args) {
		int sum = 0;
		
		/* 
		* for (int i = 1; i <= 100; i++) {
		* sum += i;
		* }
		* index�� ù ���ڰ� i�� for������ i�� ���� �����
		*/
		
		/*
		 * index++
		 * index += 1
		 * index = index + 1
		 * ����
		 */
		
		for (int index = 1; index <= 100; index += 1) {
			sum += index;
		}
		
		System.out.println("1���� 100������ �� : " + sum);
		// System.out.println("���� i�� �� : " + i);
	}
}
