package day200324;

import java.util.Random;
import java.util.Scanner;

public class Day05 {
	public static void main(String[] args) {
		// 구구단 게임 10회 완료시 실행 시간을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int i;
		int num;
		int num2;
		int answer;
		int quiz;
		long startTime;
		long endTime;
		
		startTime = System.currentTimeMillis();
		for (i = 0; i < 10; i++) { // 10번을 반복
			num = (int)(Math.random() * 8) + 2;
			num2 = rd.nextInt(9) + 1;
			
			quiz = num * num2;
			
			System.out.print(i + 1 + "번 : " + num + " X " + num2 + " = ");
			answer = sc.nextInt();
			
			if(quiz == answer) {
				System.out.println("정답입니다.");
				System.out.println();
			}else {
				System.out.println("틀렸습니다. 게임을 종료하겠습니다.");
				System.exit(0);
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("게임 진행 시간");
		System.out.println(endTime - startTime + "ms");
	}
}
