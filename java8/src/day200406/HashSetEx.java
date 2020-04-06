package day200406;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // 입력한 순서대로 나옴, 동일한 값 허용
		list.add("사과");
		list.add("배");
		list.add("포도");
		list.add("멜론");
		list.add("멜론");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();

		Set<String> set = new HashSet<>(); // 입력한 순서대로 나오지 않음, 동일한 값 허용하지 않음
		set.add("사과");
		set.add("배");
		set.add("포도");
		set.add("멜론");
		set.add("멜론");
		for (String str : set) {
			System.out.println(str);
		}
		System.out.println();

		System.out.println(set.contains("사과"));
		System.out.println(set.isEmpty());
		if (!set.isEmpty()) { // isEmpty -> 데이터가 있나
			set.clear(); // clear -> 초기화
		}
		System.out.println(set.size());
		System.out.println();

		// iterator 반복자
		Iterator<String> iterator = list.iterator(); // 컬렉션 공통 메서드
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		System.out.println();

	}
}
