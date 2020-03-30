package day200328;

public class Person {
	void sound() {
		System.out.println("말하다.");
	}
	
	void run() {
		System.out.println("달리다.");
	}
	
	void eat() {
		System.out.println("먹다.");
	}
	
	void oneDay() {
		sound(); // this가 생략되어 있다. this.sound();
		run();
		eat();
	}
}
