package day200328;

public class Person {
	void sound() {
		System.out.println("���ϴ�.");
	}
	
	void run() {
		System.out.println("�޸���.");
	}
	
	void eat() {
		System.out.println("�Դ�.");
	}
	
	void oneDay() {
		sound(); // this�� �����Ǿ� �ִ�. this.sound();
		run();
		eat();
	}
}
