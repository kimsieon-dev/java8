package day200327;

public class Day01 {
	public static void main(String[] args) {
		/*0 ~ 9���� �迭 ����� 0���� �ʱ�ȭ�ؼ� ���*/
		
		int[] arr = new int[10];
		
		for(int i = 0; i <arr.length; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		
		arr = new int[10]; // ���ο� ��ü�� ����
		
		for(int number : arr) {
			System.out.println(number);
		}
		
		/*
		 * for(int i = 0; i<arr.length; i++) { // ������ ��Ҹ� 0���� ���� arr[i] = 0;
		 * System.out.println(arr[i]); }
		 */
		
		
		
	}
}
