package day200402;

public class Audio implements RemoteControl {
	int volum;

	@Override
	public void turnOn() {
		System.out.println("������� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("������� ���ϴ�.");
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
		System.out.println("������� ������ " + this.volum + "���� �����մϴ�.");
	}
}
