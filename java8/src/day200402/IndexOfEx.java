package day200402;

public class IndexOfEx {
	public static void main(String[] args) {
		// indexOf
		String str = "자바 프로그래밍";
		int index = str.indexOf("프로");

		System.out.println(index);
		System.out.println();

		index = str.indexOf("C언어");
		System.out.println(index); // 없을 경우 -1을 리턴
		System.out.println();

		str = "자바자바자바 프로프로 그래밍이이입니다.";
		index = str.indexOf("바"); // 매개변수가 한개일때는 0번부터 검색
		System.out.println(index);
		index = str.indexOf("바", index + 1); // 첫번ㅍ째 매개변수는 검색어, 두번 째 매개변수는 시작위치
		System.out.println(index);
		index = str.indexOf("바", index + 1);
		System.out.println(index);
		index = str.indexOf("바", index + 1);

		// replace
		String str2 = str.replace("프로프로", "프로");
		System.out.println(str);
		System.out.println(str2);
	}
}
