package day200327;

import java.util.Scanner;

public class Day06 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("������ �Է��ϼ���. : ");
			int num = sc.nextInt();
			int cnt = 0;
			int sum = 0;
			
			for(int i = 1; i <= num; i++) {
				if(i % 5 == 0) {
					cnt++;
					sum += i;
				}
			}
			System.out.println("5�� ����� ������ " + cnt);
			System.out.println("5�� ����� ���� " + sum);
	}
}
