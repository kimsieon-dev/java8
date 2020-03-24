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
			System.out.print("1 ~ 100 사이의 값을 입력하세요. : ");
			cu = sc.nextInt();
			
			if(cu == answer) {
				System.out.println("정답입니다.");
			}else if(cu > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			}else if(cu < answer) {
				System.out.println("더 큰수를 입력하세요.");
			}
		}
		
	}
}
