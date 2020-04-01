package day200401;

public class DmbCellPhone extends CellPhone {
	// 필드
	int channel;

	// 생성자
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("DMB를 켭니다.");
	}
	
	void trunOffDmb() {
		System.out.println("DMB를 끕니다.");
	}
	
	void setChannel(int channel) {
		this.channel = channel;
		System.out.println(channel + "으로 채널을 변경합니다.");
	}
}
