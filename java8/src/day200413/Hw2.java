package day200413;

import java.util.Scanner;

public class Hw2 extends Thread {
	public void run() {
		String user;
		String com = ran();
		Scanner sc = new Scanner(System.in);

		System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���.");
		user = sc.nextLine();
		if (user.equals(com)) {
			System.out.println("user : " + user);
			System.out.println("com : " + com);
			System.out.println("��� : �����ϴ�.");
		} else if (user.equals("����") && com.equals("��") || user.equals("����") && com.equals("����")
				|| user.equals("��") && com.equals("����")) {
			System.out.println("user : " + user);
			System.out.println("com : " + com);
			System.out.println("��� : user�� �̰���ϴ�.");
		} else {
			System.out.println("user : " + user);
			System.out.println("com : " + com);
			System.out.println("��� : com�� �̰���ϴ�.");
		}

	}

	public String ran() {
		int ran = (int) (Math.random() * 3);
		String com = "";
		if (ran == 0) {
			com = "����";
		} else if (ran == 1) {
			com = "����";
		} else {
			com = "��";
		}
		return com;
	}

	public static void main(String[] args) {
		Hw2 user = new Hw2();
		user.start();
	}
}
