package day200326;

public class Day02 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 }; // ����ÿ��� �������� ; ���
		int arr2[] = { 60, 70, 80, 90, 100 }; // 2���� ��������� ȥ���ص� �������� �ʴ´�.

		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(arr2[i]);
		}

		arr[2] = 300; // �迭�� �ε����� �Ϲ� ����ó�� ���� ������ �� �ִ�.
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr3 = {1, 2, 3, 4, 5, 6};
		for(int i = 0; i < 6; i++) {
			System.out.println(arr3[i]);
		}
		
		/* �迭�� ������ ������ �Ѿ�� ����� �Ұ����մϴ�.
		 * arr3[6] = 7; System.out.println(arr3[6]);
		 */
	}
}
