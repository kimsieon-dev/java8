package day200402;

public class IpTV implements RemoteControl, Internet {
	private int volum;
	
	@Override
	public void serachWeb() {
		System.out.println("���ͳ��� �˻��մϴ�.");
	}

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
		this.volum = volum;
		System.out.println(this.volum + "���� ������ �����մϴ�.");
	}

}
