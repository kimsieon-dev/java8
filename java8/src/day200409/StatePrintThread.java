package day200409;

public class StatePrintThread extends Thread {
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	public void run() {
		while (true) { // ������ ���ʸ� 0.5�ʿ� �� ���� ���
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ���� : " + state);
			if (state == Thread.State.NEW) {
				targetThread.start();
			}
			if (state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}

		}
	}
}
