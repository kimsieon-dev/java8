package day200326;

import java.util.Scanner;

public class Day12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) +"번째 정수를 입력하세요. : ");
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int num : arr) {
			if(max < num) {
				max = num;
			}
		}
		System.out.println("최대값은 " + max);
	}

}
