package day200409;

public class PrintThread2 extends Thread {
	public void run() {
		// ���1
//		try {
//			while (true) {
//				System.out.println("���� ��");
//				Thread.sleep(1);
//			}
//		} catch (InterruptedException e) {
//
//		}

		// ���2
		while (true) {
			System.out.println("���� ��");
			if (Thread.interrupted()) {
				break;
			}
		}

		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
