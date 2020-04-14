package day200414;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOStream {
	static String Fname;

	public static void main(String[] args) {
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("dsfile"));
			dos.writeChar('c');
			dos.writeInt(897);
			dos.writeDouble(234.4);
			dos.writeByte(34);
			dos.writeBoolean(true);
			dos.flush();
			dos.close();

			System.out.println("������ ���� ����� : dsfile ");
			System.out.println("=======================");
			DataInputStream dis = new DataInputStream(new FileInputStream("dsfile"));
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readByte());
			System.out.println(dis.readBoolean());

		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
