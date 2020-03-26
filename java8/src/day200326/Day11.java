package day200326;

public class Day11 {
	public static void main(String[] args) {
		int[] arr = new int[300_000_000];
		int sum = 0;
		int sum2 = 0;
		
		System.out.println("C형 for 문");
		long sTime = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {
			sum += i;
		}
		long eTime = System.currentTimeMillis();
		System.out.println(eTime - sTime);
		System.out.println("==========");
		
		System.out.println("향상된 for 문");
		long sTime2 = System.currentTimeMillis();
		for(int number : arr) {
			sum2 += number;
		}
		long eTime2 = System.currentTimeMillis();
		System.out.println(eTime2 - sTime2);
	}
}
