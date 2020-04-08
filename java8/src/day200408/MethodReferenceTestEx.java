package day200408;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class MethodReferenceTestEx {
	public int add(int a, int b) {
		return a + b;
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public void oper(IntBinaryOperator operator, int a, int b) {
		System.out.println("정적/인스턴스 메소드 참조 : " + operator.applyAsInt(a, b));
	}

	public void operS(Function<String, String> stringOFunction, String a) {
		System.out.println("매개변수의 메소드 참조 : " + stringOFunction.apply(a));
	}

	public static void main(String[] args) {
		MethodReferenceTestEx ex = new MethodReferenceTestEx();

		ex.oper((a, b) -> MethodReferenceTestEx.mul(a, b), 1, 1);
		// 정적 메소드 참조
		ex.oper(MethodReferenceTestEx::mul, 1, 1);

		ex.oper((a, b) -> ex.add(a, b), 1, 1);
		// 인스턴스 메소드 참조
		ex.oper(ex::add, 1, 1);

		ex.operS(s -> s.toLowerCase(), "STRING");
		// 매개변수의 메소드 참조
		ex.operS(String::toLowerCase, "STRING");
	}
}
