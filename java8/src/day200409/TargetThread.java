package day200409;

public class TargetThread extends Thread {
	public void run() {
		String sum = "";
		for (long i = 0; i < 30_000; i++) {
			sum += i;
		}

		try {
			// 1.5�ʰ� �Ͻ� ����
			Thread.sleep(1500);
		} catch (Exception e) {

		}

		sum = "";
		for (long i = 0; i < 30_000; i++) {
			sum += i;
		}
	}

	public static void main(String[] args) {
		StatePrintThread spt = new StatePrintThread(new TargetThread());
		spt.start();

	}
}
