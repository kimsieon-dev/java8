package day200410;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButtonEx extends JPanel {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButtonEx p1 = new JButtonEx();
		JButtonEx p2 = new JButtonEx();

		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setText("변경1");
			}
		});

		btn2.addActionListener(e -> btn3.doClick());
		btn3.addActionListener(e -> btn3.setText("변경3"));

		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p1.add(p2);

		f.add(p1);
		f.pack();
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}