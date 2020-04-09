package day200409;

public class PrintThread2 extends Thread {
	public void run() {
		// 방법1
//		try {
//			while (true) {
//				System.out.println("실행 중");
//				Thread.sleep(1);
//			}
//		} catch (InterruptedException e) {
//
//		}

		// 방법2
		while (true) {
			System.out.println("실행 중");
			if (Thread.interrupted()) {
				break;
			}
		}

		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
