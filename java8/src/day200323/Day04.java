package day200323;

public class Day04 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for(i = 1; i <= 50; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1부터 50까지 중 3의 배수의 합 : " + sum + " 입니다.");
	}
}
