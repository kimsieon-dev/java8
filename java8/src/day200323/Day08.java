package day200323;

public class Day08 {
	public static void main(String[] args) {
		int i;
		int sum = 0;

		for( i = 1; i <= 50; i++) {
			sum += i;
		}
		
		// double avg = sum / 50.0;
		double avg = (double)sum / 50;
		System.out.println("1부터 50까지의 합의 평균 : " + avg + " 입니다.");
	}
}
