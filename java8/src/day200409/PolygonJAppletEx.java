package day200409;

import java.awt.Color;

import javax.swing.JFrame;

public class PolygonJAppletEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("다각형 그리기");
		PolygonJApplet p = new PolygonJApplet();

		f.setSize(500, 500);
		f.setBackground(Color.YELLOW);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);

		f.setResizable(false);
		f.setVisible(true);
	}
}
