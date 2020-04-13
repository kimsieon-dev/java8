package day200413;

import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderEx extends WindowAdapter {

	// windowEvent
	

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

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowOpened(e);
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowClosing(e);
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowIconified(e);
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowDeiconified(e);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		Window w = e.getWindow();
		int width = w.getWidth();
		int height = w.getHeight();
		System.out.println("창의 크기 : " + width + ", " + height);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowDeactivated(e);
	}

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowStateChanged(e);
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowGainedFocus(e);
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowLostFocus(e);
	}
}
