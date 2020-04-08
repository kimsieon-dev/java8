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

		functionAB = functionA.andThen(functionB); // 매개변수가 2개일때도 andThen 사용 가능
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println("거주 도시 : " + city);

		functionAB = functionB.compose(functionA); // 매개변수가 1개일때 compose 사용 가능
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println("거주 도시 : " + city);
	}
}
