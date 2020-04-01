package day200401;

public class PromoEx {
	public static void main(String[] args) {
		PromoChild pc = new PromoChild();
		pc.method1();
		pc.method2();
		pc.method3();
		
		PromoParent pp = pc; // 자식은 부모에 대입이 가능하다.(자동 형변환)
		pp.method1();
		pp.method2();
//		pp.method3(); // 부모의 형태이기 때문에 부모에는 method3가 없기 때문에 사용 불가능
		
//		pc = pp; // 자식에 부모를 대입할 수 없다.
		
		//강제 형변환
		pc = (PromoChild)pp; // 자식에부모를 대입할 수 없지만 강제 형변환은 가능
	}
}
