package java8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Day20031704 {
	public static void main(String[] args) throws Exception {
		int intnum;
		double dblnum;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("������ �Ǽ��� �Է��ϼ���! : ");
		intnum = Integer.parseInt(inbr.readLine());
		dblnum = Double.parseDouble(inbr.readLine());
		System.out.println("�Է��� ������ " + intnum + "�Դϴ�.");
		System.out.println("�Է��� �Ǽ��� " + dblnum + "�Դϴ�.");
		
	}
}
