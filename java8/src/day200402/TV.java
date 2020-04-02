package day200402;

public class TV implements RemoteControl {
	// �������̽��� ��� �޼ҵ�� �⺻������ public

	int volum;

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolum(int volum) {
		if (volum > MAX_VOLUM) {
			this.volum = MAX_VOLUM;
		} else if (volum < MIN_VOLUM) {
			this.volum = MIN_VOLUM;
		} else {
			this.volum = volum;
		}
		this.volum = volum;
		System.out.println("TV�� ������ " + this.volum + "���� �����մϴ�.");
	}

	@Override
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("TV�� ���Ұ� ���·� �����մϴ�.");
		} else {
			System.out.println("TV�� ���Ұ� ���¸� �����մϴ�.");
		}
	}

}
