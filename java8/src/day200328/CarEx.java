package day200328;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car(); // Car ��ü ����(instance)
		
		System.out.println("������ �Է� ��");
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.Speed);
		System.out.println();
		
		myCar.company = "�����ڵ���";
		myCar.model = "�ƹݶ�";
		myCar.color = "����";
		myCar.maxSpeed = 300;
		myCar.Speed = 100;
		
		System.out.println("������ �Է� ��");
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
