package day200330;

public class CarReturn {
	// 필드
	int gas;

	// 생성자 - 생략되면 기본 생성자 생성
	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // false 리턴
		}
		System.out.println("gas가 있습니다.");
		return true; // true를 리턴
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다. (gas잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas잔량 : " + gas + ")");
				return; // 메서드를 사용할때 return을 만나게 되면 멈추고 값을 반환
			}
		}
	}

}
