package day200409;

public class PriorityEx {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("thread" + i);
			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY); // 최소 우선순위
			} else {
				thread.setPriority(Thread.MAX_PRIORITY); // 최대 우선순위
			}
			thread.start();
		}
	}
}
