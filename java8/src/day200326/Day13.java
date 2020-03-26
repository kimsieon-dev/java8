package day200326;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day13 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		int r[] = new int[10];
		int number;

		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("정수 10개를 입력하세요. : ");

		for (int x = 0; x < r.length; x++) {
			r[x] = Integer.parseInt(inbr.readLine());
		}
		System.out.print("입력 데이터 값 : ");

		for (int x = 0; x < r.length; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();

		// 오름차순 정렬
		/*
		 * Arrays 클래스에서 제공하는 메소드
		 * 오름차순은 제공하지만 내림차순은 제공하지 않는다.
		 * Arrays.Sort(r); 
		 * for (int x = 0; x < r.length; x++) {
		 * System.out.println(r[x]); }
		 */
	
		
		// 버블정렬
		for(int i=0; i<r.length; i++) {
			for(int j=0; j<r.length; j++) {
				if(r[i] < r[j]) {
					int temp = r[i];
					r[i] = r[j];
					r[j] = temp;
				}
			}
		}
		
		System.out.print("오름차순 데이터 값 : ");

		for (int x = 0; x < r.length; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();
		System.out.print("합계 : ");

		int sum = 0;

		for (int x = 0; x < r.length; x++) {
			sum = sum + r[x];
		}
		System.out.println(sum);
		System.out.print("평균 : " + (sum / r.length));
	}
}