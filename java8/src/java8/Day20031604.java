package java8;

public class Day20031604 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 20;
		
		System.out.println("num1 = 10, num2 = 20");
		System.out.println("num1 < num2 : " + (num1 < num2));
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		System.out.println("num1 > num2 : " + (num1 > num2));
		System.out.println("num1 >= num2 : " + (num1 >= num2));
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 != num2 : " + (num1 != num2));
		System.out.println("====================");
		
		System.out.println("num3 = 20, num2 = 20");
		System.out.println("num3 < num2 : " + (num3 < num2));
		System.out.println("num3 <= num2 : " + (num3 <= num2));
		System.out.println("num3 > num2 : " + (num3 > num2));
		System.out.println("num3 >= num2 : " + (num3 >= num2));
		System.out.println("num3 == num2 : " + (num3 == num2));
		System.out.println("num3 != num2 : " + (num3 != num2));
		
		/*
		 * =�� 1�� ����ϸ� ���Կ����ڷ� �������� ���� �������� �����մϴ�.
		 * ==�� 2�� ����ϸ� ���ʰ� ������ ���� ���������� �Ǵ��մϴ�.
		 */
		ff
		boolean result = num1 < num2; // boolean -> ��, ����
		System.out.println(result);
                               
	}
}
