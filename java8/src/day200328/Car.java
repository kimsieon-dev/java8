package day200328;

public class Car {
	/* �ʵ� */ 
	String company = "����ڵ���";
	String model = "���";
	String color = "���";
	int maxSpeed = 200;
	int speed = 10;
	
	/* ������ */
	 Car() { // �����ڸ� �������� ������ �⺻ �����ڰ� �ڵ����� �ۼ��ȴ�.
		this("����ڵ���", "����", 300);
//		this.company = "����ڵ���";
//		this.color = "����";
//		this.maxSpeed = 300;
	 }
	

	Car(String company, String color, int maxSpeed) {
		this.company = company; // ���� �̸��� ����Ҷ� this�� ���
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	Car(String color, int maxSpeed) {
		this("����ڵ���", color, maxSpeed);
	}
	
	Car(int maxSpeed) {
		this("����ڵ���", "����", maxSpeed);
		
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
//		// �ڷ����� ���°� �ߺ��Ǹ� �Ұ���
//	}
	
	/* �޼ҵ� */
	void accel() {
		speed += 10;
		if(speed > maxSpeed) {
			speed = maxSpeed;
		}
		System.out.println("���� �ӵ� : " + speed);
	}
	
	void brake() {
		speed = 0;
		System.out.println("���� �ӵ� : " + speed);
	}
}
