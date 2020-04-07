package day200407;

public class FunctionalEx {
	public static void main(String[] args) {
		Functional f = new Functional() {

			@Override
			public void method() {
				System.out.println("f1 익명 구현객체로 메소드 호출");
			}
		};
		f.method();

		Functional f2 = () -> {
			System.out.println("f2 람다식으로 메소드 호출");
		};
		f2.method();
		
		Functional f3 = () -> System.out.println("f3 람다식으로 메소드 호출");
		f3.method();
	}
}
