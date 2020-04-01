package day200401;

public class Animal {
	void speak() {
		System.out.println("울음소리를 내다.");
	}

	void run() {
		System.out.println("뛰어갑니다.");
	}

	void haul(Animal animal) {
		animal.speak();
	}
}
