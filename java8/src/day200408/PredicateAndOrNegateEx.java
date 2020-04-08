package day200408;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateEx {
	public static void main(String[] args) {
		// 2의 배수 검사
		IntPredicate predicatA = a -> a % 2 == 0;

		// 3의 배수 검사
		IntPredicate predicateB = (a) -> a % 3 == 0;

		IntPredicate predicateAB;
		boolean result;

		// and()
		predicateAB = predicatA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? : " + result);

		// or()
		predicateAB = predicatA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? : " + result);

		// negate()
		predicateAB = predicatA.negate();
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까? : " + result);
	}
}
