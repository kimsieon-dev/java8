package day200414;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BuffedIOStream {
	public static void main(String[] args) throws IOException {
		System.out.println("���ڸ� �Է��ϰ� [����] ġ����.");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("�Է��� ���� ���� : ");
		String str = br.readLine();
		System.out.println(str);
		System.out.println();

		System.out.println("��� ��Ʈ�� : ");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("���� ��� ��Ʈ�� ���");
		bw.flush();
	}
}
