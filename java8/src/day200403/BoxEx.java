package day200403;

public class BoxEx {
	public static void main(String[] args) {
		String name = "홍길동";
		Box box = new Box();

		box.set(name); // String -> Object 자동 형변환
		String name2 = (String)box.get(); // Object -> String 강제 형변환
		System.out.println(name2);
		
		Apple apple = new Apple();
		System.out.println(apple.hashCode());
		box.set(apple); // Apple -> Object 자동 형변환
		Apple apple2 = (Apple)box.get(); // Object -> Apple 강제 형변환
		System.out.println(apple2.hashCode());
	}
}
