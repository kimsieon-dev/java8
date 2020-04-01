package day200401;

public class Tire {
	// 필드
	int maxRotation; // 최대 회전수(타이어 수명)
	int accumulatedRotation; // 누적 회전수
	String location; // 타이어 위치

	// 생성자
	Tire(String location, int maxRotataion) {
		this.location = location;
		this.maxRotation = maxRotataion;
	}

	// 메소드
	boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "Tire 펑크 ***");
			return false;
		}
	}
}
