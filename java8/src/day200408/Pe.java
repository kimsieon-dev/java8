package day200408;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Pe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �и��� �̸��� ��ȭ��ȣ 4���� �Է��Ͻÿ�.");
		Map<String, String> map = new Hashtable<String, String>();

		for (int i = 0; i < 4; i++) {
			System.out.print("�̸�, ��ȭ��ȣ : ");
			String key = sc.next();
			String value = sc.next();
			map.put(key, value);
		}

		System.out.println("��ȭ��ȣ�� �˻��� �̸��� �Է��Ͻÿ�.");
		String serach = sc.next();
		String tel = map.getOrDefault(serach, "��ϵ��� ���� ����");
		System.out.println(serach + "�� ��ȭ��ȣ�� " + tel + " �Դϴ�.");
		sc.close();
	}
}
