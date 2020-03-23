package day200323;

public class Day13 {
	public static void main(String[] args) {
		// 1 ~ 100 중 5의 배수의 합을 출력하세요.

		int i;
		int sum = 0;
		int count = 0;

		for (i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("5의 배수의 합은 : " + sum + " 입니다.");
		System.out.println("==========");

		// 1 ~ 50 중 3의 배수는 화면에 출력하세요.
		for (i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("==========");
		
		// 1 ~ 50 중 3의 배수의 총 합과 개수를 출력하세요.
		sum = 0;
		for( i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("3의 배수의 합은 : " + sum + " 입니다.");
		System.out.println("3의 배수의 개수는 : " + count + "개 입니다.");
	}
}
