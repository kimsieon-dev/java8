package day200402;

public class A {
	// �ν��Ͻ� ��� Ŭ����
	class B {

	}

	// ���� ��� Ŭ����
	static class C {

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
	static C outerfield4 = new C(); // (o) ������ ����

	// ���� �޼ҵ�
	static void method2() {
		// B var1 = new B(); // (x) A ��ü ����
		C var2 = new C(); // (o) ������ ����
	}
}