package day200410;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelEx {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p2.add(new JButton("��ư 1"));
		p2.add(new JButton("��ư 2"));
		p2.add(new JButton("��ư 3"));
		p1.add(p2);
		f.add(p1);
		
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}