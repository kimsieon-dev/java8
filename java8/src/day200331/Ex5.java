package day200331;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5 {
	public static void main(String[] args) throws IOException {
		System.out.println("����� ���ڿ��� �Է��ϼ���. : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		String instr = inbr.readLine();
		StringBuffer str = new StringBuffer(instr);
		
		System.out.println();
		System.out.println("�Է��� ���ڿ� : " + str);
		
		str.reverse();
		System.out.println("�Ųٷ� ��µ� ���ڿ� : " + str);
	}
}
