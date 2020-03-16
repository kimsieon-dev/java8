package java8;

public class Day20031606 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		a += b; // a = a + b
		System.out.println(a);
		a -= b; // a = a - b
		System.out.println(a);
		a *= b; // a = a * b
		System.out.println(a);
		System.out.println("==========");
		
		a = 10;
		System.out.println(a);
		a *= 3 + 10; // a = a * 13
		System.out.println(a);
		a += 1; // a = 130 + 1
		System.out.println(a);
		a += 1; // a = 131 + 1
		System.out.println(a);
		
	}
}
