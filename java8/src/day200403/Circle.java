package day200403;

public class Circle {
	static final double PI = 3.14; // ��� ����
	int r;

	public Circle(int r) {

	}

	double area() {
		return PI * r * r;
	}

	String showCircle() {
		return "Radius : " + r;
	}
}
