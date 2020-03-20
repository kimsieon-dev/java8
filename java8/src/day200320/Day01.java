package day200320;

public class Day01 {
	public static void main(String[] args) {
		int sum = 0;
		
		/* 
		* for (int i = 1; i <= 100; i++) {
		* sum += i;
		* }
		* index의 첫 글자가 i라서 for문에는 i를 많이 사용함
		*/
		
		/*
		 * index++
		 * index += 1
		 * index = index + 1
		 * 같다
		 */
		
		for (int index = 1; index <= 100; index += 1) {
			sum += index;
		}
		
		System.out.println("1부터 100까지의 합 : " + sum);
		// System.out.println("현재 i의 값 : " + i);
	}
}
