package day200402;

public interface RemoteControl {
	// 필드
	public static int MAX_VOLUM = 10; // 인터페이스의 필드는 상수이기 때문에 대문자로
	int MIN_VOLUM = 0; // 기본적으로 인터페이스는 pulic static 자동으로 생략

	// 추상 메서드
	abstract void turnOn(); // 추상 메서드는 abstract가 자동으로 생략

	void turnOff();

	void setVolum(int volum);

	// 일반 메서드
	default void setMute(boolean mute) { // 일반 메서드를 사용하기 위해서는 default를 입력해야한다.
		if (mute) {
			System.out.println("음소거 상태로 설정합니다.");
		} else {
			System.out.println("음소거 상태를 해제합니다.");
		}
	}
	
	// 정적 메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
