package day200403;

public class BoundedTypeParameterEx {
	public static void main(String[] args) {
		// String str = Util.compare("a", "b"); -> (x) String�� Number�� ������ �ƴϴ�.

		int result1 = Util.compare(10, 20); // t1, t2�� int�̹Ƿ� Integer�� ���߰� ����
		System.out.println(result1); // �ڿ� ���� Ŀ�� -1�� ����

		int result2 = Util.compare(4.5, 3); // t1�� double, t2�� int
		System.out.println(result2); // �տ� ���� Ŀ�� 1�� ����

		int result3 = Util.compare(100, 100);
		System.out.println(result3); // ���� ���� ���� 0���� ����
	}
}
