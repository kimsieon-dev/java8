package day200407;

public class Func2Ex {
	public static void main(String[] args) {
		Func2 func1 = new Func2() { // 익명 구현 객체

			@Override
			public int method(int x, int y) {
				int result = x + y;
				return result;
			}
		};
		System.out.println(func1.method(10, 20));
		System.out.println("====================");

		Func2 func2 = (int x, int y) -> { // 메소드가 1개이면 람다식 사용 가능
			int result = x + y;
			return result;
		};
		System.out.println(func2.method(10, 20));
		
		Func2 func3 = (x, y) -> {return x + y;};
		System.out.println(func3.method(10, 20));
		
		Func2 func4 = (x, y) -> x + y;
		System.out.println(func4.method(10, 20));
	}
}
