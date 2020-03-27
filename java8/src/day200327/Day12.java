package day200327;

import java.util.Random;
import java.util.Scanner;

public class Day12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final String ga = "가위";
		final String ba = "바위";
		final String bo = "보";
		String user = "";
		String com = "";
		int an;
		int score = 0;
		int life = 3;
		
		while(true) {
			do {
				System.out.println("가위 : 1, 바위 : 2, 보 : 3, 종료 : 4");
				System.out.print("> ");
				an = sc.nextInt();
				
				
				switch(an) {
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
					System.out.println("게임을 종료합니다.");
					System.exit(0);
				default :
					System.out.println("잘못 입력하셨습니다.");
					System.out.println();
				}
			}while(user.equals(""));
			
			Random rd = new Random();
			an = 0;
			an = rd.nextInt(3);
			
			switch(an) {
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
			
			if(user.equals(ga) && com.equals(bo) || user.equals(bo) && com.equals(ba) || user.equals(ba) && com.equals(ga) ) {
				score += 100;
				System.out.println("유저가 이겼습니다.");
				System.out.println("유저 : "+ user + ", 컴퓨터 : " + com);
			}else if(user.equals(com)) {
				score += 10;
				System.out.println("비겼습니다.");
				System.out.println("유저 : "+ user + ", 컴퓨터  : " + com);
			}else {
				life -= 1;
				System.out.println("컴퓨터가 승리했습니다.");
				System.out.println("유저 : "+ user + ", 컴퓨터  : " + com);
			}
			System.out.println("점수 : " + score + "점, " + "목숨 : " + life + "개");
			System.out.println();
			
			if(life == 0) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
		}
		
	}
}
