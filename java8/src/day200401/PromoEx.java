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
//		pp.method3(); // �θ��� �����̱� ������ �θ𿡴� method3�� ���� ������ ��� �Ұ���
	}
}
