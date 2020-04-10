package day200410;

import java.awt.Color;

import javax.swing.JFrame;

import day200409.PolygonJApplet;

public class PieChartEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("파이파트");
		PieChart p = new PieChart();

		f.add(p);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setResizable(false);
		f.setVisible(true);
	}
}
