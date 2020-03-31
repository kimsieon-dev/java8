package day200331;

public class compareToEx {
	public static void main(String[] args) {
		// 03
		String a = "aaa"; // 값이 같으면 다음 값으로 넘어가고 틀리면 뺀다
		String b = "Abc"; 
		int res = a.compareTo(b);
		
		System.out.println("비교결과 : " + res);
		
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
