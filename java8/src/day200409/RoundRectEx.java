package day200409;

import java.awt.Color;

import javax.swing.JFrame;

public class RoundRectEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("�簢�� �׸���");
		RoundRect p = new RoundRect();

		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);

		f.setResizable(false);
		f.setVisible(true);
	}
}
