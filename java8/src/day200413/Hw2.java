package day200413;

import java.util.Scanner;

public class Hw2 extends Thread {
	public void run() {
		String user;
		String com = ran();
		Scanner sc = new Scanner(System.in);

		System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
		user = sc.nextLine();
		if (user.equals(com)) {
			System.out.println("user : " + user);
			System.out.println("com : " + com);
			System.out.println("결과 : 비겼습니다.");
		} else if (user.equals("가위") && com.equals("보") || user.equals("바위") && com.equals("가위")
				|| user.equals("보") && com.equals("바위")) {
			System.out.println("user : " + user);
			System.out.println("com : " + com);
			System.out.println("결과 : user가 이겼습니다.");
		} else {
			System.out.println("user : " + user);
			System.out.println("com : " + com);
			System.out.println("결과 : com가 이겼습니다.");
		}

	}

	public String ran() {
		int ran = (int) (Math.random() * 3);
		String com = "";
		if (ran == 0) {
			com = "가위";
		} else if (ran == 1) {
			com = "바위";
		} else {
			com = "보";
		}
		return com;
	}

	public static void main(String[] args) {
		Hw2 user = new Hw2();
		user.start();
	}
}
