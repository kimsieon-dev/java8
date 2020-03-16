package java8;

public class Day20031607 {
	public static void main(String[] args) {
		int a = 10;
		
		System.out.println(a);
		a += 1; // a = 1 + 1
		System.out.println(a);
		a += 1; // a = 2 + 1
		System.out.println(a);
		a += 1; // a = 3 + 1 
		System.out.println(a);
		System.out.println("==========");
		
		a++; // 후위, 후치 연산자
		System.out.println(a);
		a++;
		System.out.println(a);
		a++;
		System.out.println(a);
		System.out.println("==========");
		
		++a; // 전위, 전치 연산자
		System.out.println(a);
		++a;
		System.out.println(a);
		++a;
		System.out.println(a);
		System.out.println("==========");
		
		--a;
		System.out.println(a);
		--a;
		System.out.println(a);
		--a;
		System.out.println(a);
		System.out.println("==========");
		
		a--;
		System.out.println(a);
		a--;
		System.out.println(a);
		a--;
		System.out.println(a);
		System.out.println("==========");
		
		a = 10;
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println("==========");
		
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println("==========");
		
		System.out.println(a);
		
	}
}
