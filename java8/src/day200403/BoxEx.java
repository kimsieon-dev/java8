package day200403;

public class BoxEx {
	public static void main(String[] args) {
		String name = "ȫ�浿";
		Box box = new Box();

		box.set(name); // String -> Object �ڵ� ����ȯ
		String name2 = (String)box.get(); // Object -> String ���� ����ȯ
		System.out.println(name2);
		
		Apple apple = new Apple();
		System.out.println(apple.hashCode());
		box.set(apple); // Apple -> Object �ڵ� ����ȯ
		Apple apple2 = (Apple)box.get(); // Object -> Apple ���� ����ȯ
		System.out.println(apple2.hashCode());
	}
}
