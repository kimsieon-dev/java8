package day200323;

public class Day05 {
	public static void main(String[] args) {
		int i;
		int mul = 1;
		
		for( i = 1; i <= 10; i++) {
			mul *= i;
		}
		System.out.println("1부터 10까지의 곱 : " + mul + " 입니다.");
	}
}
