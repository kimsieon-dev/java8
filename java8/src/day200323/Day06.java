package day200323;

public class Day06 {
	public static void main(String[] args) {
		int i;
		int count = 0;
		
		for( i = 1; i <= 50; i++) {
			if(i % 3 == 0) {
				count++;
			}
		}
		System.out.println("1���� 50������ �� �� 3�� ����� ���� : " + count + "�� �Դϴ�.");
	}
}
