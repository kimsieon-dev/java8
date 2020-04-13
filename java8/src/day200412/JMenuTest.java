package day200412;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuTest extends JFrame {
	public static void main(String[] args) {

	JFrame j = new JFrame();
	JMenuBar jmb = new JMenuBar();
	JMenu jmu1 = new JMenu("파일");
	JMenu jmu2 = new JMenu("편집");
	JMenu jmu3 = new JMenu("보기");

	JMenuItem jmi1 = new JMenuItem("새로만들기");
	JMenuItem jmi2 = new JMenuItem("열기");
	JMenuItem jmi3 = new JMenuItem("저장");

	jmu1.add(jmi1);
	jmu1.add(jmi2);
	jmu1.add(jmi3);

	JMenuItem jmi4 = new JMenuItem("잘라내기");
	JMenuItem jmi5 = new JMenuItem("복사");
	JMenuItem jmi6 = new JMenuItem("붙여넣기");

	jmu2.add(jmi4);
	jmu2.add(jmi5);
	jmu2.add(jmi6);

	JMenuItem jmi7 = new JMenuItem("도구모음");
	JMenuItem jmi8 = new JMenuItem("상태표시줄");

	jmu3.add(jmi7);
	jmu3.add(jmi8);

	jmb.add(jmu1);
	jmb.add(jmu2);
	jmb.add(jmu3);

	TextField tf = new TextField();
	tf.setEnabled(false);

	j.add(tf,BorderLayout.SOUTH);
	j.setJMenuBar(jmb);
	j.setSize(300,300);
	j.setVisible(true);

	ActionListener listener = e -> 
		tf.setText(e.getActionCommand());
		
		jmi1.addActionListener(listener);
		jmi2.addActionListener(listener);
		jmi3.addActionListener(listener);
		jmi4.addActionListener(listener);
		jmi5.addActionListener(listener);
		jmi6.addActionListener(listener);
		jmi7.addActionListener(listener);
		jmi8.addActionListener(listener);
		
	}
}