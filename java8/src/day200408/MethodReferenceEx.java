package day200408;

import java.util.function.IntBinaryOperator;

public class MethodReferenceEx {
	public static void main(String[] args) {
		IntBinaryOperator operator;

		operator = new IntBinaryOperator() { // 익명 구현객체

			@Override
			public int applyAsInt(int left, int right) {
				return Calculator.staticMethod(left, right);
			}
		};

		int result = operator.applyAsInt(10, 20);
		System.out.println(result);
		System.out.println("====================");

		operator = (int left, int right) -> { // 람다식
			return Calculator.staticMethod(left, right);
		};

		operator = (x, y) -> Calculator.staticMethod(x, y);
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
		System.out.println("====================");

		operator = Calculator::staticMethod; // 정적 메소드 참조
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
		System.out.println("====================");

		Calculator calc = new Calculator();
		operator = calc::instanceMethod; // 인스턴스 메소드 참조
//		operator = Calculator::instanceMethod; // 인스턴스 메소드는 클래스명으로 호출 불가능
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
	}
}
