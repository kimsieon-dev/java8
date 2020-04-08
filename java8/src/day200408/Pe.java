package day200408;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Pe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("공백으로 분리된 이름과 전화번호 4개를 입력하시오.");
		Map<String, String> map = new Hashtable<String, String>();

		for (int i = 0; i < 4; i++) {
			System.out.print("이름, 전화번호 : ");
			String key = sc.next();
			String value = sc.next();
			map.put(key, value);
		}

		System.out.println("전화번호를 검색할 이름을 입력하시오.");
		String serach = sc.next();
		String tel = map.getOrDefault(serach, "등록되지 않은 상태");
		System.out.println(serach + "의 전화번호는 " + tel + " 입니다.");
		sc.close();
	}
}
