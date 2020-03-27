package day200327;

public class Day02 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		
		for(int i =2; i<arr.length; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		for(int num : arr) {
			System.out.println(num);
		}
	}
}
