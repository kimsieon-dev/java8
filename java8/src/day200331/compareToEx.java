package day200331;

public class compareToEx {
	public static void main(String[] args) {
		String a = "aaa"; // 값이 같으면 다음 값으로 넘어가고 틀리면 뺀다
		String b = "Abc"; 
		int res = a.compareTo(b);
		
		System.out.println("비교결과 : " + res);
	}
}
