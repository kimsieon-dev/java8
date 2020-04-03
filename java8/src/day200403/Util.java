package day200403;

public class Util {
	// 제네릭 메소드
	public static <T> Box2<T> boxing(T t) {
		Box2<T> box = new Box2<T>();
		box.set(t);
		return box;
	}
	
	// 제한된 타입 파라미터(<T extends 최상위타입>)
	public static <T extends Number> int compare(T t1, T t2) { // extends는 최상위 클래스를 설정
		double v1 = t1.doubleValue();
//		System.out.println(t1.getClass().getName());
		double v2 = t2.doubleValue();
//		System.out.println(t2.getClass().getName());
		return Double.compare(v1, v2);
	}
}
