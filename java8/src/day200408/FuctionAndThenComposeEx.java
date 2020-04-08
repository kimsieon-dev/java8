package day200408;

import java.util.function.Function;

public class FuctionAndThenComposeEx {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;

		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();

		functionAB = functionA.andThen(functionB); // �Ű������� 2���϶��� andThen ��� ����
		city = functionAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����")));
		System.out.println("���� ���� : " + city);

		functionAB = functionB.compose(functionA); // �Ű������� 1���϶� compose ��� ����
		city = functionAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����")));
		System.out.println("���� ���� : " + city);
	}
}
