package day200323;

public class Day06 {
	public static void main(String[] args) {
		int i;
		int count = 0;
		
		for( i = 1; i <= 50; i++) {
			if(i % 3 == 0) {
				count++;
			}
		}
		System.out.println("1에서 50까지의 수 중 3의 배수의 개수 : " + count + "개 입니다.");
	}
}
