package day200330;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car("�ֿ��ڵ���", "���", 300); // Car ��ü ����(instance)
		
		System.out.println("������ �Է� ��");
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		System.out.println();
		
		myCar.company = "�����ڵ���";
		myCar.model = "�ƹݶ�";
		myCar.color = "����";
		myCar.maxSpeed = 300;
		myCar.speed = 100;
		
		System.out.println("������ �Է� ��");
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		System.out.println();
		
		Car yourCar = new Car("����ڵ���", "����", 300);
		System.out.println(yourCar.company);
		System.out.println(yourCar.model);
		System.out.println(yourCar.color);
		System.out.println(yourCar.maxSpeed);
		System.out.println(yourCar.speed);
		System.out.println();
		
		System.out.println("������ ����");
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
		
		Car c3 = new Car("�Ķ�", 350);
		System.out.println(c3.company);
		System.out.println(c3.model);
		System.out.println(c3.color);
		System.out.println(c3.maxSpeed);
		System.out.println(c3.speed);
		System.out.println();
		
		c3.accel(); // �޼��� ȣ��
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
