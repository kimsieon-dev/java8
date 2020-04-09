package day200409;

public class Customer extends Thread {
	Account acc1;

	Customer(Account acc) {
		this.acc1 = acc;
	}

	public void run() {
		try {
			for (int i = 0; i < 300; i++) {
				System.out.println("쓰레드 " + getName() + " : " + i + "번째");
				acc1.deposit(1000);
				sleep(50);
				if (acc1.gettot() >= 1_000_000)
					break;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
