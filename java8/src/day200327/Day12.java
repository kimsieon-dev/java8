package day200327;

import java.util.Random;
import java.util.Scanner;

public class Day12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final String ga = "����";
		final String ba = "����";
		final String bo = "��";
		String user = "";
		String com = "";
		int an;
		int score = 0;
		int life = 3;
		
		while(true) {
			do {
				System.out.println("���� : 1, ���� : 2, �� : 3, ���� : 4");
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
					System.out.println("������ �����մϴ�.");
					System.exit(0);
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
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
				System.out.println("������ �̰���ϴ�.");
				System.out.println("���� : "+ user + ", ��ǻ�� : " + com);
			}else if(user.equals(com)) {
				score += 10;
				System.out.println("�����ϴ�.");
				System.out.println("���� : "+ user + ", ��ǻ��  : " + com);
			}else {
				life -= 1;
				System.out.println("��ǻ�Ͱ� �¸��߽��ϴ�.");
				System.out.println("���� : "+ user + ", ��ǻ��  : " + com);
			}
			System.out.println("���� : " + score + "��, " + "��� : " + life + "��");
			System.out.println();
			
			if(life == 0) {
				System.out.println("������ �����մϴ�.");
				System.exit(0);
			}
		}
		
	}
}
