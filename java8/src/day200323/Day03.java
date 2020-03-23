package day200323;

public class Day03 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		// 짝수일 때
		for(i = 1; i<=10; i++) {
			if(i % 2 == 0) { 
				sum += i;
				
		/* 
		 * 홀수일 때
		 * for(i = 1; i <= 10; i++) {
		 * 	if(i % 2 != 0) {
		 * 		continue;
		 * 	}
		 * sum += i;
		 * }
		 */
			}
		}
		System.out.println("1부터 10까지 중 짝수의 합은 : " + sum + (" 입니다."));
	}
}
