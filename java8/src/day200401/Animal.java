package day200401;

public class Animal {
	void speak() {
		System.out.println("�����Ҹ��� ����.");
	}

	void run() {
		System.out.println("�پ�ϴ�.");
	}

	void haul(Animal animal) {
		animal.speak();
	}
}
