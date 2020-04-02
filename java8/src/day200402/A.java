package day200402;

public class A {
	A() {
		System.out.println("A ��ü�� ������");
	}
	
	// �ν��Ͻ� ��� Ŭ����
	class B {
		B() {
			System.out.println("B ��ü�� ������");
		}

		int field1;

//		static int field2; static�� �ν��Ͻ��� ����� ����� �� ����.
		void method1() {

		}
		// static void method2() {}
	}

	// ���� ��� Ŭ����
	static class C { // Ŭ������ ������ ���� static�� static�� ����
		C() {
			System.out.println("C ��ü�� ������");
		}

		int field1;
		static int field2;

		void method1() {

		}

		static void method2() {

		}
	}

	void method() {
		/* ���� Ŭ���� */ // static�� ���� �� ����.
		class D {
			D() {
				System.out.println("D ��ü�� ������");
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

	// �ν��Ͻ� �ʵ�
	B outerfield1 = new B(); // (o)
	C outerfield2 = new C(); // (o)

	// �ν��Ͻ� �޼ҵ�
	void method1() {
		B var1 = new B(); // (o)
		C var2 = new C(); // (o)
	}

	// ���� �ʵ� �ʱ�ȭ
	// static B field3 = new B(); // (x) A ��ü ����
	static C outerfield4 = new C(); // (o) ������ ���� ����Ҷ��� static�� static�� ��밡��

	// ���� �޼ҵ�
	static void method2() {
		// B var1 = new B(); // (x) A ��ü ����
		C var2 = new C(); // (o) ������ ����
	}
}