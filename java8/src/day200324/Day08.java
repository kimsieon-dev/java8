package day200324;

import java.util.Random;
import java.util.Scanner;

public class Day08 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int answer =  rd.nextInt(100) + 1;
		int cu;
		
		while(true) {
			System.out.print("1 ~ 100 ������ ���� �Է��ϼ���. : ");
			cu = sc.nextInt();
			
			if(cu == answer) {
				System.out.println("�����Դϴ�.");
			}else if(cu > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}else if(cu < answer) {
				System.out.println("�� ū���� �Է��ϼ���.");
			}
		}
		
	}
}
