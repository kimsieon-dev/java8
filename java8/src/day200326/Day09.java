package day200326;

public class Day09 {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println("2���� ������ �Է��� �ּ���. : ");
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
		}
		
		String num = args[0];
		String num2 = args[1];
		int iNum = Integer.parseInt(num);
		int iNum2 = Integer.parseInt(num2);
		System.out.println("num : " + num + ", num2 : " + num2);
		System.out.println("num + num2 = " + (iNum + iNum2));
	}
}
