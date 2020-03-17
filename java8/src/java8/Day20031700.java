package java8;

public class Day20031700 {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		/* 비트 이동(shift) 연산자 */
		int res1 = a << 2;
		System.out.println(res1);
		
		int res2 = a >> 1;
		System.out.println(res2);
		
		int res3 = a >> 2;
		System.out.println(res3);
		
		int res4 = ~b; // 비트 논리 연산자
		System.out.println(res4);
		
		int res5 = res4 << 1;
		System.out.println(res5);
		
		int res6 = res4 >> 1;
		System.out.println(res6);
		
		int res7 = res4 >>> 1;
		System.out.println(res7);
		
		/* 비트 논리 연산자 */
		/*
		 * a = 0011
		 * b = 0101
		 */
		int res8 = a & b; // 비트 논리 연산자는 기호를 하나만 사용
		System.out.println(res8); // 0001
		
		int res9 = a | b;
		System.out.println(res9); // 0111
		
		int res10 = a ^ b;
		System.out.println(res10); // 0110
	}
}
