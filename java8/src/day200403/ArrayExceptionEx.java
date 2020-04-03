package day200403;

public class ArrayExceptionEx {
	public static void main(String[] args) {
		exceptionTest();
	}

	static void exceptionTest() {
		int[] arr = new int[3];
		try {
			arr[2] = 100; // ���� �߻��� �ٷ� catch�� �̵�
			System.out.println(arr[2]);
//			throw new ArrayIndexOutOfBoundsException(); // ���������� ���ܸ� �߻���Ű���� ��ü�� ������ throw �Ѵ�.
		
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("���� ������ �Ұ����ϰų� �迭�� ������ ������ϴ�.");
		} catch (Exception e) {
			System.out.println("�߻��� ��� ���ܸ� ó���մϴ�.");
			e.printStackTrace();
		} finally { // finally - > ���ܿ� ������� ������ �����ϴ� ����, ��������
			System.out.println("finally �����Դϴ�.");
		}
		
		try {
			Thread.sleep(100); // ����ó�� ���̴� ������ �Ұ����� �ڵ�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
