package java8;

import java.util.Scanner;

public class Day20031901 {
	public static void main(String[] args) {
		/* �Էµ� ���� ¦������ Ȧ������ Ȯ���ϴ� ���α׷�*/
		Scanner sc = new Scanner(System.in);
		int inputnumber = 0;
		
		System.out.println("Ȧ���� ¦���� �Ǻ��ϴ� ���α׷��Դϴ�.");
		System.out.print("���ڸ� �Է����ּ���. : ");
		inputnumber = sc.nextInt();
		
		String result = ""; // �������� 0���� �ʱ�ȭ�ϰ� ���ڿ��� ""���� �ʱ�ȭ�մϴ�.
		
		if(inputnumber % 2 == 0) { // if���� ����Ͽ� ������ true�� ��쿡 �����ϴ� �߰�ȣ ���� �ۼ�
			result = "¦��";
			System.out.println("¦������ �Ǻ��� �Դϴ�.");
		}else {
			result = "Ȧ��";
			System.out.println("Ȧ������ �Ǻ��� �Դϴ�.");
		}
		
		System.out.println("�Է��Ͻ� ���ڴ� " + inputnumber + "�̰�, �� ���ڴ� " 
				+ result + "�Դϴ�." );
		
		sc.close();
	}

}
