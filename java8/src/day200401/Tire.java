package day200401;

public class Tire {
	// �ʵ�
	int maxRotation; // �ִ� ȸ����(Ÿ�̾� ����)
	int accumulatedRotation; // ���� ȸ����
	String location; // Ÿ�̾� ��ġ

	// ������
	Tire(String location, int maxRotataion) {
		this.location = location;
		this.maxRotation = maxRotataion;
	}

	// �޼ҵ�
	boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + "Tire ��ũ ***");
			return false;
		}
	}
}
