package day200326;

public class Day04 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int[] arr2 = {0, 0, 0, 0, 0}; // 0���� ä���� ũŰ�� 5�� �迭
		int[] arr3 = new int[5]; // �迭�� ũ�Ⱑ 5�� ���� ���� �迭, ũ�⸸ ����
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println("==========");
		
		boolean[] arr4 = new boolean[5];
		for(int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		System.out.println("==========");
		
		String[] arr5 = new String[5];
		for(int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		
		/*
		 *  �߰�ȣ �ʱ�ȭ�� ������ �ѹ��� ��밡��
		 *  arr3 = {10, 20 ,30, 40, 50}; -> �Ұ���
		 */
		
		/*
		 * ������ �ε����� �����ϴ� ���� ����
 		 * arr3[0] = 10;
		 * arr3[1] = 20;
		 * arr3[2] = 30;
		 * arr3[3] = 40;
		 * arr3[4] = 50;
		 */
		
	} 
}
