package day200409;

public class DataBox {
	private String data;

	public synchronized String getData() {
		if (this.data == null) { // data �ʵ尡 null�̸� �Һ��� �����带 �Ͻ� ���� ���·� ����
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		String returnValue = data;
		System.out.println("ConsumerThread�� ���� ������ : " + returnValue);
		data = null; // data �ʵ带 null�� ����� ������ �����带 ���� ��� ���·� ����
		notify(); // ���� �ִ°� �����ش�.
		return returnValue;
	}

	public synchronized void setData(String data) {
		if (this.data != null) { // data �ʵ尡 null�� �ƴϸ� ������ �����带 �Ͻ� ���� ���·� ����
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		System.out.println("ProducerThread�� ������ ������ : " + data);
		this.data = data; // data �ʵ忡 ���� �����ϰ� �Һ��� �����带 ���� ��� ���·� ����
		notify();
	}
}