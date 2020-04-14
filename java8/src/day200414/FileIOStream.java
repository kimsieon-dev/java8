package day200414;

import java.io.FileReader;
import java.io.IOException;

public class FileIOStream {
	static String tfile;

	public static void main(String[] args) {
		int cnt;
		char chr;
		if (args.length != 1) {
			System.out.println("�Ű������� �ؽ�Ʈ���� �̸��� �Է��ϼ���.");
			System.exit(1);
		}

		tfile = args[0];
//		FileReader fr = null;
		try {
			FileReader fr = new FileReader(tfile);
			System.out.println("���� �̸� : " + tfile);
			System.out.println("==================");
			while ((cnt = fr.read()) != -1) {
				chr = (char) cnt;
				System.out.print(chr);
			}
		} catch (IOException e) {
			System.out.println(e.toString());
//		} finally {
//			if(fr != null)
//				try {
//					fr.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		}
		}
	}
}
