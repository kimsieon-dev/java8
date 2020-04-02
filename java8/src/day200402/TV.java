package day200402;

public class TV implements RemoteControl {
	// 인터페이스의 모든 메소드는 기본적으로 public

	int volum;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
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
		System.out.println("TV의 볼륨을 " + this.volum + "으로 변경합니다.");
	}

	@Override
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("TV를 음소거 상태로 설정합니다.");
		} else {
			System.out.println("TV의 음소거 상태를 해제합니다.");
		}
	}

}
