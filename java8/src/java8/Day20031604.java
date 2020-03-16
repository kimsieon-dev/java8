package java8;

public class Day20031604 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 20;
		
		System.out.println("num1 = 10, num2 = 20");
		System.out.println("num1 < num2 : " + (num1 < num2));
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		System.out.println("num1 > num2 : " + (num1 > num2));
		System.out.println("num1 >= num2 : " + (num1 >= num2));
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 != num2 : " + (num1 != num2));
		System.out.println("====================");
		
		System.out.println("num3 = 20, num2 = 20");
		System.out.println("num3 < num2 : " + (num3 < num2));
		System.out.println("num3 <= num2 : " + (num3 <= num2));
		System.out.println("num3 > num2 : " + (num3 > num2));
		System.out.println("num3 >= num2 : " + (num3 >= num2));
		System.out.println("num3 == num2 : " + (num3 == num2));
		System.out.println("num3 != num2 : " + (num3 != num2));
		
		/*
		 * =을 1개 사용하면 대입연산자로 오른쪽의 값을 왼쪽으로 대입합니다.
		 * ==을 2개 사용하면 왼쪽과 오른쪽 값이 동일한지를 판단합니다.
		 */
		ff
		boolean result = num1 < num2; // boolean -> 참, 거짓
		System.out.println(result);
                               
	}
}
