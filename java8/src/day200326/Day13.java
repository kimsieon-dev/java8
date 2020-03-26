package day200326;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day13 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		int r[] = new int[10];
		int number;

		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("���� 10���� �Է��ϼ���. : ");

		for (int x = 0; x < r.length; x++) {
			r[x] = Integer.parseInt(inbr.readLine());
		}
		System.out.print("�Է� ������ �� : ");

		for (int x = 0; x < r.length; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();

		// �������� ����
		/*
		 * Arrays Ŭ�������� �����ϴ� �޼ҵ�
		 * ���������� ���������� ���������� �������� �ʴ´�.
		 * Arrays.Sort(r); 
		 * for (int x = 0; x < r.length; x++) {
		 * System.out.println(r[x]); }
		 */
	
		
		// ��������
		for(int i=0; i<r.length; i++) {
			for(int j=0; j<r.length; j++) {
				if(r[i] < r[j]) {
					int temp = r[i];
					r[i] = r[j];
					r[j] = temp;
				}
			}
		}
		
		System.out.print("�������� ������ �� : ");

		for (int x = 0; x < r.length; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();
		System.out.print("�հ� : ");

		int sum = 0;

		for (int x = 0; x < r.length; x++) {
			sum = sum + r[x];
		}
		System.out.println(sum);
		System.out.print("��� : " + (sum / r.length));
	}
}