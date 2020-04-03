package day200403;

public class BoxEx2 {
	public static void main(String[] args) {
		String name = "홍길동";
		Box box = new Box();

		box.set(name); // String -> Object 자동 형변환
		String name2 = (String) box.get(); // Object -> String 강제 형변환
		System.out.println(name2);

		Apple apple = new Apple();
		System.out.println(apple.hashCode());
		box.set(apple); // Apple -> Object 자동 형변환
		Apple apple2 = (Apple) box.get(); // Object -> Apple 강제 형변환
		System.out.println(apple2.hashCode());

		// 제네릭 사용
		Box2<String> box2 = new Box2<>();
		box2.set(name);
		name2 = box2.get();
		System.out.println(name2);

//		box2.set(apple); // box2는 제네릭으로 String만 사용하도록 설정했음
		Box2<Apple> box3 = new Box2<Apple>();
		box3.set(apple);
		apple2 = box3.get();
//		box3.set(name); // box3는 apple만 사용 가능, String은 사용 불가능
	}
}
