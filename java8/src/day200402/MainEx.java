package day200402;

public class MainEx {
	public static void main(String[] args) {
		A.C.field2 = 10; // static ����� ��ü���� ����� ����.
		A.C.method2();
		A.C c = new A.C();
		c.field1 = 10;
		c.field2 = 10;
		c.method1();
		c.method2();
		
		A a = new A();
		A.B b = a.new B(); // �ν��Ͻ� ��� Ŭ������ ��üȭ(���� ��� Ŭ������ ��üȭ�� �ڵ尡 �ٸ���)
		b.field1 = 10;
		b.method1();
		
		a.method(); // ����Ŭ���� D�� ����ϴ� �޼���
		
	}
}
