package day200413;

import java.util.Random;

public class Hw extends Thread {
	int r;
	String name;
	Random rd = new Random();

	Hw(String n) {
		name = n;
	}

	public void run() {
		r = rd.nextInt(3);
		String p;

		switch (r) {
		case 0:
			p = "가위";
			System.out.println(name + " : " + p);
			break;
		case 1:
			p = "바위";
			System.out.println(name + " : " + p);
			break;
		case 2:
			p = "보";
			System.out.println(name + " : " + p);
			break;
		}
	}
	
		

	public static void main(String[] args) {
		Hw user = new Hw("user");
		Hw com = new Hw("com");
		user.start();
		com.start();

		try {
			sleep(500);
			
		} catch (Exception e) {

		}

		if (user.r == com.r) {
			System.out.println("비겼습니다.");
		} else if (user.r == 0 && com.r == 2 || user.r == 1 && com.r == 0) {
			System.out.println("유저가 이겼습니다.");
		} else {
			System.out.println("컴퓨터가 이겼습니다.");
		}

	}
}
