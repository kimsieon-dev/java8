package day200323;

public class Day07 {
	public static void main(String[] args) {
		// 1 ~ 10까지 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("==========");
		
		// 10 ~ 1까지 출력
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("==========");
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(10 - i);
		}
		System.out.println("==========");
		
		// 숫자 대신 #으로 출력
		for (int i = 1; i <= 10; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("==========");
		
		// 10 -> 1개까지 #을 출력하세요.
		for (int i = 10; i >= 1; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
