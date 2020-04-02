package day200402;

public class Audio implements RemoteControl {
	int volum;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
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
		System.out.println("오디오의 볼륨을 " + this.volum + "으로 변경합니다.");
	}
}
