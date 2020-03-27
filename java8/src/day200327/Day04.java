package day200327;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Day04 {
	public static void main(String[] args) {
		/*
		 * 로또 추첨
		 * 1 ~ 45를 입력한 배열을 작성 작성한 배열을 무작위로 섞는다. 
		 * 0 인덱스부터 6인덱스까지 출력
		 */

		int[] arr = new int[45];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + "\t");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();

		int tmp = 0;
		int num = 0;

		for (int i = 0; i < 10_000; i++) {
			num = (int) (Math.random() * 45);

			tmp = arr[0];
			arr[0] = arr[num];
			arr[num] = tmp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if((i+1) % 5 ==0) {
				System.out.println();
			}
		}
		System.out.println();
		
		int[] ary = Arrays.copyOf(arr, 6);
		Arrays.sort(ary);
		System.out.print("당첨 번호 : ");
		for(int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println(", 보너스 번호 : " + arr[7]);
	}
}
