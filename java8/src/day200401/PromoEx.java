package day200401;

public class PromoEx {
	public static void main(String[] args) {
		PromoChild pc = new PromoChild();
		pc.method1();
		pc.method2();
		pc.method3();

		PromoParent pp = pc; // �ڽ��� �θ� ������ �����ϴ�.(�ڵ� ����ȯ)
		pp.method1();
		pp.method2();
//		pp.method3(); // �θ��� �����̱� ������ �θ𿡴� method3�� ���� ������ ��� �Ұ���

//		pc = pp; // �ڽĿ� �θ� ������ �� ����.

		// ���� ����ȯ
		pc = (PromoChild) pp; // �ڽĿ��θ� ������ �� ������ ���� ����ȯ�� ����
		pc.method1(); // �θ��� ��ü�� �ڽ��� ��ü�� ���Ե� ���� �������� �ڽ� ��ü����߸� �Ѵ�.
		pc.method2();
		pc.method3();

		PromoParent pp2 = new PromoParent();
		if (pp instanceof PromoChild) { // instanceof�� ����ȯ�� �������� boolean ������ ��ȯ�մϴ�.
			pc = (PromoChild) pp; // ���� ����ȯ�� ������ ���·� ������ �����մϴ�.
			pc.method3();

		} else {
			System.out.println("���� ����ȯ�� ����� �� �����ϴ�.");
		}
	}
}
