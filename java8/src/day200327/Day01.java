package day200327;

public class Day01 {
	public static void main(String[] args) {
		/*0 ~ 9까지 배열 출력후 0으로 초기화해서 출력*/
		
		int[] arr = new int[10];
		
		for(int i = 0; i <arr.length; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		
		arr = new int[10]; // 새로운 객체를 대입
		
		for(int number : arr) {
			System.out.println(number);
		}
		
		/*
		 * for(int i = 0; i<arr.length; i++) { // 각각의 요소를 0으로 대입 arr[i] = 0;
		 * System.out.println(arr[i]); }
		 */
		
		
		
	}
}
