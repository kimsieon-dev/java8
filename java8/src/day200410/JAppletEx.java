package day200410;

import javax.swing.JFrame;

public class JAppletEx {
	public static void main(String[] args) {

		JFrame f = new JFrame("파이파트");
		JApplet p = new JApplet();

		f.add(p);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setResizable(false);
		f.setVisible(true);
	}
}
