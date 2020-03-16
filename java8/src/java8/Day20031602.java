package java8;

public class Day20031602 {
	public static void main(String[] args) {
		int number1 = 100; // 지역변수
		System.out.println(number1);
		{ // 중괄호블럭
			System.out.println(number1);
			int number2 = 200; // 블럭변수
			System.out.println(number2);
		}
		System.out.println(number1);
		//	System.out.println(number2);
	}
}
