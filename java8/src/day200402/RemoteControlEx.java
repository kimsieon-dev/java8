package day200402;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl.changeBattery();
		TV tv = new TV();
		Audio audio = new Audio();
//		RemoteControl rc = new RemoteControl(); // 인터페이스는 생성자가 없다.
		RemoteControl rc; // 변수는 정의할 수 있다.
		rc = tv; // 인터페이스 변수에는 구현 클래스의 객체가 대입된다.
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

		// 익명 구현 개체, 한번만 사용가능
		rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("보일러를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("보일러를 끕니다.");
			}

			@Override
			public void setVolum(int volum) {
				System.out.println("온도의 단계를 " + volum + "단계로 변경합니다.");
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
