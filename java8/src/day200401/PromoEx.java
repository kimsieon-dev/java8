package day200401;

public class PromoEx {
	public static void main(String[] args) {
		PromoChild pc = new PromoChild();
		pc.method1();
		pc.method2();
		pc.method3();
		
		PromoParent pp = pc;
		pp.method1();
		pp.method2();
//		pp.method3(); // 부모의 형태이기 때문에 부모에는 method3가 없기 때문에 사용 불가능
	}
}
