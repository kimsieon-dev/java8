package day200402;

public class A {
	// 인스턴스 멤버 클래스
	class B {

	}

	// 정적 멤버 클래스
	static class C {

	}

	// 인스턴스 필드
	B outerfield1 = new B(); // (o)
	C outerfield2 = new C(); // (o)

	// 인스턴스 메소드
	void method1() {
		B var1 = new B(); // (o)
		C var2 = new C(); // (o)
	}

	// 정적 필드 초기화
	// static B field3 = new B(); // (x) A 객체 없음
	static C outerfield4 = new C(); // (o) 정적은 가능

	// 정적 메소드
	static void method2() {
		// B var1 = new B(); // (x) A 객체 없음
		C var2 = new C(); // (o) 정적은 가능
	}
}