package day200410;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JApplet extends JPanel {
	public void paint(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillOval(20, 60, 100, 100);

		g.setColor(Color.RED);
		g.fillOval(40, 80, 60, 60);

		g.setColor(Color.GREEN);
		g.fillRect(60, 160, 20, 50);

		g.setColor(Color.YELLOW);
		g.fillArc(80, 185, 50, 25, 220, 180);
		g.fillArc(10, 185, 50, 25, 140, 180);
	}
}
