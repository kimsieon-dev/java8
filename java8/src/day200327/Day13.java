package day200327;

import java.util.Scanner;

public class Day13 {
	public static void main(String[] args) {
		final String ga = "����";
		final String ba = "����";
		final String bo = "��";
		int com;
		int user;
		

		while (true) {
			Scanner sc = new Scanner(System.in);

			com = (int) (Math.random() * 3) + 1;

			do {
				System.out.println("����, ����, �� �߿� �ϳ��� �����ϼ���.");
				System.out.println("���� : 1, ���� : 2, �� : 3, ����: 4");
				System.out.print("> ");
				user = sc.nextInt();
				if (user < 1 || user > 4) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				}else if(user == 4) {
					System.out.println("������ �����մϴ�.");
					System.exit(0);
				}
			} while (user < 1 || user > 4);

			String userStr = user == 1 ? "����" : user == 2 ? "����" : "��";
			String comStr = com == 1 ? "����" : com == 2 ? "����" : "��";
			if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
				System.out.println("���� ��! ����: " + userStr + ", ��ǻ��: " + comStr);
			} else if (user == com) {
				System.out.println("�����ϴ�. ����: " + userStr + ", ��ǻ��: " + comStr);
			} else {
				System.out.println("��ǻ�� ��! ����: " + userStr + ", ��ǻ��: " + comStr);
			}
			System.out.println();
		}
	}
}
