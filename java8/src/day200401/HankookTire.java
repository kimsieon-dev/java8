package day200401;

public class HankookTire extends Tire {
	// �ʵ�

	// ������
	HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + "HankookTire ��ũ ***");
			return false;
		}
	}
}
