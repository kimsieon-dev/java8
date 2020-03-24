package day200323;

import java.util.Random;
import java.util.Scanner;

public class Day15 {
	public static void main(String[] args) {
		final String ga = "가위";
		final String ba = "바위";
		final String bo = "보";
		String user = "";
		String com = "";
		int score = 0;
		int life = 3;
		int temp;

		Scanner sc = new Scanner(System.in);
		while(true) {
		do {
			System.out.println("가위:1, 바위:2, 보:3, 종료:4");
			System.out.print(">");
			temp = sc.nextInt();

			switch (temp) {
			case 1:
				user = ga;
				break;
			case 2:
				user = ba;
				break;
			case 3:
				user = bo;
				break;
			case 4:
				System.out.println("4번을 선택하여 프로그램을 종료합니다.");
				System.out.println("score : " + score + "점" + ", life : " + life);
				System.exit(0);
			default:
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
			}
		} while (user.equals(""));

		Random rd = new Random();
		temp = 0;
		temp = rd.nextInt(3);
		switch (temp) {
		case 0:
			com = ga;
			break;
		case 1:
			com = ba;
			break;
		case 2:
			com = bo;
			break;
		}
		
		/*
		if ((user.equals(ga) && com.equals(bo)) || (user.equals(ba)) && (com.equals(ga))
				|| (user.equals(bo)) && (com.equals(ba))); {
					score += 100;
					System.out.println("유저 승! 유저 : " + user + ", 컴퓨터 : " + com);
		}else if(user.equals(com)) {
			score += 10;
			System.out.println("비겼음! 유저 : " + user + ", 컴퓨터 : " + com);
		}else {
			life -= 1;
			System.out.println("컴퓨터 승! 유저 : " + user + ", 컴퓨터 : " + com);
		}
		System.out.println("score : " + score + "점, life : " + life);
		if(life == 0 ) {
			System.out.println("게임을 종료합니다.");
			System.exit(0);
		}
		*/
		}
	}
}
