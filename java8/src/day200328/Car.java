package day200328;

public class Car {
	/* 필드 */ 
	String company = "기아자동차";
	String model = "쏘울";
	String color = "흰색";
	int maxSpeed = 200;
	int speed = 10;
	
	/* 생성자 */
	 Car() { // 생성자를 생성하지 않으면 기본 생성자가 자동으로 작성된다.
		this("기아자동차", "검정", 300);
//		this.company = "기아자동차";
//		this.color = "검정";
//		this.maxSpeed = 300;
	 }
	

	Car(String company, String color, int maxSpeed) {
		this.company = company; // 같은 이름을 사용할땐 this를 사용
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	Car(String color, int maxSpeed) {
		this("기아자동차", color, maxSpeed);
	}
	
	Car(int maxSpeed) {
		this("기아자동차", "검정", maxSpeed);
		
	}
	/*
	 * Car(String com, String col, int max) { 
	 * company = com;
	 * color = col; 
	 * maxSpeed = max;
	 * {
	 */
	
	
//	Car(String company, int maxSpeed, String color) {
//		
//	}
//	
//	Car(String color, int speed, int maxSpeed) {
//		
//	}
//	
//	Car(String company, String color, int maxSpeed, int speed) {
//		
//	}
//	
//	Car(int maxSpeed, String color, String company) {
//		// 자료형의 형태가 중복되면 불가능
//	}
	
	/* 메소드 */
	void accel() {
		speed += 10;
		if(speed > maxSpeed) {
			speed = maxSpeed;
		}
		System.out.println("현재 속도 : " + speed);
	}
	
	void brake() {
		speed = 0;
		System.out.println("현재 속도 : " + speed);
	}
}
