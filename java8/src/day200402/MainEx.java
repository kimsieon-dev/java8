package day200402;

public class MainEx {
	public static void main(String[] args) {
		A.C.field2 = 10; // static 멤버는 객체없이 사용이 가능.
		A.C.method2();
		A.C c = new A.C();
		c.field1 = 10;
		c.field2 = 10;
		c.method1();
		c.method2();
		
		A a = new A();
		A.B b = a.new B(); // 인스턴스 멤버 클래스의 객체화(정적 멤버 클래스의 객체화와 코드가 다르다)
		b.field1 = 10;
		b.method1();
		
		a.method(); // 로컬클래스 D를 사용하는 메서드
		
	}
}
