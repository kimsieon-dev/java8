package day200410;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PieChart extends JPanel {
	int[] input = { 30, 15, 45, 10 };
	String[] title = { "��", "��", "��", "������" };
	Color[] color = { Color.red, Color.orange, Color.blue, Color.gray };

	public void init() {
		setBackground(Color.LIGHT_GRAY);
	}

	public void paint(Graphics g) {
		int startAngle = 0;
		int pieSize = 200;
		int subtot = 0;

		for (int i = 0; i < input.length; i++) {
			subtot += input[i];
		}

		for (int i = 0; i < input.length; i++) {
			// ���̸� �׸��� �κ�
			int arcAngle = (input[i] * 100 / subtot) * 360 / 100;
			g.setColor(color[i]);
			g.fillArc(50, 50, pieSize, pieSize, startAngle, arcAngle);
			startAngle += arcAngle;

			// ���ʸ� �׸��� �κ�
			g.fillRect(300, 50 + i * 32, 30, 30);
			g.setColor(Color.BLACK);
			g.drawString(title[i], 335, 70 + i * 32);
		}
	}

}
