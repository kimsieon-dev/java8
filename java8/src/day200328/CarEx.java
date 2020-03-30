package day200328;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car(); // Car 객체 생성(instance)
		
		System.out.println("데이터 입력 전");
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.Speed);
		System.out.println();
		
		myCar.company = "현대자동차";
		myCar.model = "아반떼";
		myCar.color = "은색";
		myCar.maxSpeed = 300;
		myCar.Speed = 100;
		
		System.out.println("데이터 입력 후");
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.Speed);
		System.out.println();
		
		Car yourCar = new Car();
		System.out.println(yourCar.company);
		System.out.println(yourCar.model);
		System.out.println(yourCar.color);
		System.out.println(yourCar.maxSpeed);
		System.out.println(yourCar.Speed);
		System.out.println();
	}
}
