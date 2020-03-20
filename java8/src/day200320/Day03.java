package day200320;

public class Day03 {
	public static void main(String[] args) {
		int i;
		int j;
		int k;
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 5; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		} // for문 끝
		
		// for문 다시 시작하므로 i 사용해도 상관없음.
		for (k = 0; k < 3; k++) {
			System.out.println("안녕하세요.");
		}
	}

}
