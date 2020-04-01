package day200401;

public class OverrideChild extends OverrideParent {
	void method3() {
		System.out.println("자식 메서드3");
	}
	
	@Override // 재정의
	void method2() {
		System.out.println("자식 메서드2");
	}
}
