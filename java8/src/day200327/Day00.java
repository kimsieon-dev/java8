package day200327;

public class Day00 {
	public static void main(String[] args) {
		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println("==========");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
			System.out.println("==========");

			int sum = 0;
			for (i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			System.out.println("1 ~ 100ÀÇ ÇÕ : " + sum);
		}
	}
}
