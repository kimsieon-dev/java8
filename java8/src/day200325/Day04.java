package day200325;

public class Day04 {
	public static void main(String[] args) {
		/*
		 * for���� ����ؼ� a ~ z���� ���
		 * abcdefghijklmnopqrstuvwxyz ��
		 * ABCDEFGHIJKLMNOPQRSTUVWXYZ ��
		 * ����ȯ�� �ʿ�
		 */
		
	
		char i;
		char j;
		
		for(i = 97; i <= 122; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		for(i = 65; i <= 90; i++) {
			System.out.print(i);
		}
	}
}
