package day200331;

public class compareToEx {
	public static void main(String[] args) {
		// 03
		String a = "aaa"; // ���� ������ ���� ������ �Ѿ�� Ʋ���� ����
		String b = "Abc"; 
		int res = a.compareTo(b);
		
		System.out.println("�񱳰�� : " + res);
		
		// 04
		String c = "Java Programming Very Good";
		String d = "java Programming";
		
		boolean compare1 = c.regionMatches(false, 5, d, 5, 11);
		boolean compare2 = c.regionMatches(true, 0, d, 0, 4);
		boolean compare3 = c.regionMatches(false, 0, d, 0, 4);
		
		System.out.println(compare1);
		System.out.println(compare2);
		System.out.println(compare3);


	}
}
