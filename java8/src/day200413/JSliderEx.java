package day200413;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderEx {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("슬라이더 예제");

		JSlider s = new JSlider(0, 100, 50);
		s.setMajorTickSpacing(10);
		s.setMinorTickSpacing(1);
		s.setPaintTicks(true);
		s.setPaintLabels(true);

		s.addChangeListener(e -> {
			JSlider js = (JSlider) e.getSource();
			int value = js.getValue();
			System.out.println("현재값 : " + value);
		});

		f.add(s);
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
