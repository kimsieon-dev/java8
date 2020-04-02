package day200402;

public class IpTV implements RemoteControl, Internet {
	private int volum;
	
	@Override
	public void serachWeb() {
		System.out.println("인터넷을 검색합니다.");
	}

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
		this.volum = volum;
		System.out.println(this.volum + "으로 볼륨을 변경합니다.");
	}

}
