package java8;

import java.util.Random;
import java.util.Scanner;

public class Day20031909 {
	public static void main(String[] args) {
		String ga = "����";
		String ba = "����";
		String bo = "��";
		String user = "";
		String com = "";
		
		// ��� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("����, ����, �� �� �ϳ��� �����ϼ���. <����=a, ����=b, ��=c>");
		user = sc.next();
		
		switch(user) {
		case "a":
		case "A":
			user = "ga";
			break;
		case "b":
		case "B":
			user = "ba";
			break;
		case "c":
		case "C":
			user = "bo";
			break;
			default:
				user ="error";
		}
		if(user == "error") {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.exit(0);
			
		}
		
		// ��ǻ�� ����
		int num = (int)(Math.random() * 3);
		
		switch(num) {
		case 0:
			com = "ga";
			break;
		case 1:
			com = "ba";
			break;
		case 2:
			com = "bo";
			break;
		}
		
		if((user == bo && com == ba) || (user == ga && com == bo) || (user == ba && com == ga)) {
			System.out.println("��� ��! ��� : " + user + ", ��ǻ�� : " + com);
		}else if (user == com) {
			System.out.println("�����ϴ�! ���: " + user + ", ��ǻ�� : " + com);
		}else {
			System.out.println("��ǻ�� ��! ���: " + user + ", ��ǻ�� : " + com);
		}
	}
}
