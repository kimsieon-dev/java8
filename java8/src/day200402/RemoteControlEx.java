package day200402;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl.changeBattery();
		TV tv = new TV();
		Audio audio = new Audio();
//		RemoteControl rc = new RemoteControl(); // �������̽��� �����ڰ� ����.
		RemoteControl rc; // ������ ������ �� �ִ�.
		rc = tv; // �������̽� �������� ���� Ŭ������ ��ü�� ���Եȴ�.
		rc = new TV();

		rc.turnOn();
		rc.setVolum(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();

		rc = audio;
		rc.turnOn();
		rc.setVolum(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();

		// �͸� ���� ��ü, �ѹ��� ��밡��
		rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("���Ϸ��� �մϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("���Ϸ��� ���ϴ�.");
			}

			@Override
			public void setVolum(int volum) {
				System.out.println("�µ��� �ܰ踦 " + volum + "�ܰ�� �����մϴ�.");
			}
		};

		rc.turnOn();
		rc.setVolum(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		rc = new IpTV();
		rc.turnOn();
		rc.setVolum(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		rc = new IpTV2();
		rc.turnOn();
		rc.setVolum(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
	}
}