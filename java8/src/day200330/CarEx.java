package day200330;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car("쌍용자동차", "노랑", 300); // Car 객체 생성(instance)
		
		System.out.println("데이터 입력 전");
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		System.out.println();
		
		myCar.company = "현대자동차";
		myCar.model = "아반떼";
		myCar.color = "은색";
		myCar.maxSpeed = 300;
		myCar.speed = 100;
		
		System.out.println("데이터 입력 후");
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		System.out.println();
		
		Car yourCar = new Car("기아자동차", "검정", 300);
		System.out.println(yourCar.company);
		System.out.println(yourCar.model);
		System.out.println(yourCar.color);
		System.out.println(yourCar.maxSpeed);
		System.out.println(yourCar.speed);
		System.out.println();
		
		System.out.println("생성자 예제");
		Car c1 = new Car();
		System.out.println(c1.company);
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.maxSpeed);
		System.out.println(c1.speed);
		System.out.println();
		
		Car c2 = new Car(250);
		System.out.println(c2.company);
		System.out.println(c2.model);
		System.out.println(c2.color);
		System.out.println(c2.maxSpeed);
		System.out.println(c2.speed);
		System.out.println();
		
		Car c3 = new Car("파랑", 350);
		System.out.println(c3.company);
		System.out.println(c3.model);
		System.out.println(c3.color);
		System.out.println(c3.maxSpeed);
		System.out.println(c3.speed);
		System.out.println();
		
		c3.accel(); // 메서드 호출
		c3.speed = 325;
		c3.accel();
		c3.accel();
		c3.accel();
		c3.accel();
		c3.accel();
		c3.accel();
		c3.brake();
		
	}
}
