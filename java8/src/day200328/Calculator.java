package day200328;

public class Calculator {
	void pwerOn() {
		System.out.println("전원을 켭니다.");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	int plus(long x, long y) {
		int result = (int)x + (int)y + 10_000;
		return result;
	}

	double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}

	void powerOFF() {
		System.out.println("전원을 끕니다.");
	}
}
