package day200408;

import java.awt.Toolkit;

public class BeepClass {
	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		System.out.println("현재 스레드 명 : " + Thread.currentThread().getName());

		Thread t1 = new Thread(new Runnable() { // 익명 구현객체

			@Override
			public void run() {

				for (int i = 0; i < 5; i++) {
					tk.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {

					}
				}
			}
		});

		t1 = new Thread(() -> { // 람다식

			System.out.println("t1 스레드 명 : " + Thread.currentThread().getName());
			for (int i = 0; i < 5; i++) {
				tk.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

				}
			}
		});
		t1.start(); // 스레드 실행 메소드

		for (int i = 0; i < 5; i++) {
			System.out.println("경고");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}
}
