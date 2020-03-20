package day200320;

import java.util.Random;
import java.util.Scanner;

public class Day08 {
	public static void main(String[] args) {
		String ga = "����";
		String ba = "����";
		String bo = "��";
		String user = "";
		String com = "";
		int score = 0;
		int life = 3;

		Scanner sc = new Scanner(System.in);
		while (true) {
			// ��� �Է�
			// ���� ��������
			System.out.print("����, ����, �� �� �ϳ��� �����ϼ���. <����=a, ����=b, ��=c, ����=q>");
			user = sc.next();

			switch (user) {
			case "a":
			case "A":
				user = ga;
				break;
			case "b":
			case "B":
				user = ba;
				break;
			case "c":
			case "C":
				user = bo;
				break;
			case "q":
			case "Q":
				user = "quit";
				break;
			default:
				user = "error";
			}
			if (user == "error") {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.exit(0);

			} else if (user == "quit") {
				System.out.println("���Ḧ �����ϼ̽��ϴ�. ���α׷��� �����ϰڽ��ϴ�.");
				break;
			}

			// ��ǻ�� ����
			int num = (int) (Math.random() * 3);

			switch (num) {
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

			if ((user.equals(bo) && com.equals(ba)) || (user.equals(ga) && com.equals(bo))
					|| (user.equals(ba) && com.equals(ga))) {
				System.out.println("��� ��! ��� : " + user + ", ��ǻ�� : " + com);
				score += 100;
			} else if (user.equals(com)) {
				System.out.println("�����ϴ�! ���: " + user + ", ��ǻ�� : " + com);
				score += 10;
			} else {
				System.out.println("��ǻ�� ��! ���: " + user + ", ��ǻ�� : " + com);
				life -= 1;
			}
			System.out.println("���� ���� : " + score + ", ���� life : " + life);
			System.out.println();

			if (life == 0) {
				System.out.println("������ ����Ǿ����ϴ�.");
				break;
			}
			// ������ ��
		}
	}
}
