package day200323;

public class Day09 {
	public static void main(String[] args) {
		int i;

		System.out.println("1에서 100까지 출력하시오.");
		System.out.println();
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " PINGPONG");
			} else if (i % 5 == 0) {
				System.out.println(i + " PONG");
			} else if (i % 3 == 0) {
				System.out.println(i + " PING");
			} else {
				System.out.println(i);
			}
		}
	}
}
