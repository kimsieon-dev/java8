package day200327;

import java.util.Scanner;

public class Day07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� ������ �Է��ϼ���. : ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num > num2) {
			System.out.println("ū �� : " + num + ", ���� �� : " + num2);
		}else {
			System.out.println("ū �� : " + num2 + ", ���� ��  : " + num);
		}
		
		int[] arr = new int[2];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		/*
		 * if(arr[0] > arr[1]) { 
		 * int temp = arr[0]; 
		 * arr[0] = arr[1]; 
		 * arr[1] = temp; }
		 * System.out.println("ū �� : " + arr[1] + ", ���� �� : " + arr[0]);
		 */
	}
}


