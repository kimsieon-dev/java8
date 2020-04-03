package day200403;

public class BoundedTypeParameterEx {
	public static void main(String[] args) {
		// String str = Util.compare("a", "b"); -> (x) String은 Number의 하위가 아니다.

		int result1 = Util.compare(10, 20); // t1, t2가 int이므로 Integer로 유추가 가능
		System.out.println(result1); // 뒤에 값이 커서 -1이 리턴

		int result2 = Util.compare(4.5, 3); // t1은 double, t2는 int
		System.out.println(result2); // 앞에 값이 커서 1로 리턴

		int result3 = Util.compare(100, 100);
		System.out.println(result3); // 같은 값일 때는 0으로 리턴
	}
}
