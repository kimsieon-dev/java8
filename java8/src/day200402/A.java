package day200402;

public class A {
	A() {
		System.out.println("A 객체가 생성됨");
	}
	
	// 인스턴스 멤버 클래스
	class B {
		B() {
			System.out.println("B 객체가 생성됨");
		}

		int field1;

//		static int field2; static은 인스턴스의 멤버로 사용할 수 없다.
		void method1() {

		}
		// static void method2() {}
	}

	// 정적 멤버 클래스
	static class C { // 클래스를 선언할 때는 static만 static을 가짐
		C() {
			System.out.println("C 객체가 생성됨");
		}

		int field1;
		static int field2;

		void method1() {

		}

		static void method2() {

		}
	}

	void method() {
		/* 로컬 클래스 */ // static을 가질 수 없다.
		class D {
			D() {
				System.out.println("D 객체가 생성됨");
			}

			int field1;

			// static int field2;
			void method1() {

			}

			// static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
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
	static C outerfield4 = new C(); // (o) 정적은 가능 사용할때는 static는 static만 사용가능

	// 정적 메소드
	static void method2() {
		// B var1 = new B(); // (x) A 객체 없음
		C var2 = new C(); // (o) 정적은 가능
	}
}