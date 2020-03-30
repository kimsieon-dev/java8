package day200330;

public class CallByValue {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		CallByValue cv = new CallByValue();
		int res = cv.plus(num1, num2);
		System.out.println(res);
		System.out.println(num1 + num2);

	}

	int plus(int x, int y) {
		x += 10;
		y += 10;
		return x + y;
	}
}
