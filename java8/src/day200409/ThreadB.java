package day200409;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;

	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB �۾� ����");
			}else {
				ThreadB.yield();
			}
		}
		System.out.println("ThreadB ����");
	}
}
