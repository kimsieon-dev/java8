package day200324;

public class Day00 {
	public static void main(String[] args) {
		// 1 ~ 100까지 출력
		int i;
		int sum = 0;
		int sub = 0;

		for (i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println("==========");

		// 1 ~ 100 중 3과 5의 공배수의 합
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("==========");

		// 1 ~ 100 중에 짝수는 더하고 홀수는 뺀 결과를 출력하세요
		sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			} else {
				sub += i;
			}
		}
		System.out.println("짝수는 더하고 홀수는 뺸 결과 : " + (sum - sub));
		System.out.println("==========");

		sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			} else {
				sum -= i;
			}
		}
		System.out.println(sum);
	}
}
