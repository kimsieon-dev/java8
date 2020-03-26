package day200326;

import java.util.Random;
import java.util.Scanner;

public class Day15 {
	public static void main(String[] args) {
		int strike = 0;
		int ball = 0;
		int com[] = new int[3];
		int user[] = new int[3];

		Random rd = new Random();

		while (com[0] == 0) {
			com[0] = rd.nextInt(9) + 1;
		} while (com[0] == com[1] || com[1] == 0) {
			com[1] = rd.nextInt(9) + 1;
		} while (com[0] == com[2] || com[1] == com[2] || com[2] == 0) {
			com[2] = rd.nextInt(9) + 1;
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(strike < 3) {
			for(int i = 0; i < user.length; i++) {
				System.out.print(i+1 + "번째 수 : ");
				user[i] = sc.nextInt();
				
			}
			
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(com[i] == user[j]) {
						if(i==j) {
							strike +=1;
						}else {
							ball +=1;
						}
					}
				}
			}
			if(strike == 0 && ball == 0) {
				System.out.println("아웃");
			}else if(strike==3) {
				System.out.println("정답입니다.");
			}else {
				System.out.println(strike + "strike" + ", " + ball + "ball");
				strike = 0;
				ball = 0;
			}
		}
	}
}
