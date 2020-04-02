package day200402;

public interface RemoteControl {
	// �ʵ�
	public static int MAX_VOLUM = 10; // �������̽��� �ʵ�� ����̱� ������ �빮�ڷ�
	int MIN_VOLUM = 0; // �⺻������ �������̽��� pulic static �ڵ����� ����

	// �߻� �޼���
	abstract void turnOn(); // �߻� �޼���� abstract�� �ڵ����� ����

	void turnOff();

	void setVolum(int volum);

	// �Ϲ� �޼���
	default void setMute(boolean mute) { // �Ϲ� �޼��带 ����ϱ� ���ؼ��� default�� �Է��ؾ��Ѵ�.
		if (mute) {
			System.out.println("���Ұ� ���·� �����մϴ�.");
		} else {
			System.out.println("���Ұ� ���¸� �����մϴ�.");
		}
	}
	
	// ���� �޼���
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
