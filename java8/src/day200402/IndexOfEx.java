package day200402;

public class IndexOfEx {
	public static void main(String[] args) {
		// indexOf
		String str = "�ڹ� ���α׷���";
		int index = str.indexOf("����");

		System.out.println(index);
		System.out.println();

		index = str.indexOf("C���");
		System.out.println(index); // ���� ��� -1�� ����
		System.out.println();

		str = "�ڹ��ڹ��ڹ� �������� �׷��������Դϴ�.";
		index = str.indexOf("��"); // �Ű������� �Ѱ��϶��� 0������ �˻�
		System.out.println(index);
		index = str.indexOf("��", index + 1); // ù����° �Ű������� �˻���, �ι� ° �Ű������� ������ġ
		System.out.println(index);
		index = str.indexOf("��", index + 1);
		System.out.println(index);
		index = str.indexOf("��", index + 1);

		// replace
		String str2 = str.replace("��������", "����");
		System.out.println(str);
		System.out.println(str2);
	}
}
