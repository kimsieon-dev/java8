package day200410;

public class ThreadClassEx extends Thread {
	int delay;

	public ThreadClassEx(String name, int delay) {
		super(name);
		this.delay = delay;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(delay);
			}

		} catch (Exception e) {
			System.out.println("error");
			return;
		}
	}

	public static void main(String[] args) {
		ThreadClassEx t1 = new ThreadClassEx("������1", 300);
		ThreadClassEx t2 = new ThreadClassEx("������2", 800);
		ThreadClassEx t3 = new ThreadClassEx("������3", 400);

		t1.start();
		t2.start();
		t3.start();
	}

}
