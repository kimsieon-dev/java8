package day200409;

import javax.swing.JFrame;

public class ParamJAppletEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("���ø� ù ����");
		ParamJApplet p = new ParamJApplet();
		p.init("Java");

		f.setSize(500, 500);
//		f.setTitle("���ø� ù ����");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);
	}
}
