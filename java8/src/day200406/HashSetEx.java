package day200406;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // �Է��� ������� ����, ������ �� ���
		list.add("���");
		list.add("��");
		list.add("����");
		list.add("���");
		list.add("���");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();

		Set<String> set = new HashSet<>(); // �Է��� ������� ������ ����, ������ �� ������� ����
		set.add("���");
		set.add("��");
		set.add("����");
		set.add("���");
		set.add("���");
		for (String str : set) {
			System.out.println(str);
		}
		System.out.println();

		System.out.println(set.contains("���"));
		System.out.println(set.isEmpty());
		if (!set.isEmpty()) { // isEmpty -> �����Ͱ� �ֳ�
			set.clear(); // clear -> �ʱ�ȭ
		}
		System.out.println(set.size());
		System.out.println();

		// iterator �ݺ���
		Iterator<String> iterator = list.iterator(); // �÷��� ���� �޼���
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		System.out.println();

	}
}
