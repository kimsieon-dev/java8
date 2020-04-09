package day200409;

import java.awt.Color;

import javax.swing.JFrame;

public class DrawLineEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("라인 그리기");
		DrawLine p = new DrawLine();
		p.init();
		
		f.add(p);
		f.setBackground(Color.ORANGE);
		f.setSize(500, 500);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
