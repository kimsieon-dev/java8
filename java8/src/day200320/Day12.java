package day200320;

public class Day12 {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
		}
		System.out.println(i);
	}
}
