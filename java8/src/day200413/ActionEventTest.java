package day200413;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionEventTest extends JFrame implements ActionListener {
	JButton jbtn1, jbtn2, jbtn3, jbtn4; // �ʵ� ����

	ActionEventTest() {
		super("ActionEvent ó��");
		setLayout(new FlowLayout()); // FlowLayout -> ������� ���
		jbtn1 = new JButton("�Է�");
		add(jbtn1);
		jbtn2 = new JButton("Ȯ��");
		add(jbtn2);
		jbtn3 = new JButton("�ɼ�");
		add(jbtn3);
		jbtn4 = new JButton("�޽���");
		add(jbtn4);

		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		jbtn3.addActionListener(this);
		jbtn4.addActionListener(this);

		setSize(300, 200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbtn1) {
			String name = JOptionPane.showInputDialog(this, "�̸��� �Է��ϼ���!");
			System.out.println(name);
		}

		if (e.getSource() == jbtn2) {
			int con = JOptionPane.showConfirmDialog(this, "Ȯ��?");
			if (con == JOptionPane.YES_NO_OPTION) {;
//				System.exit(0);
			}
		}

		if (e.getSource() == jbtn3) {
			String[] option = { "�˻�", "�߰�", "���" };
			JOptionPane.showOptionDialog(this, "���ϴ� ���� ����", "�ɼ� ��ȭ����", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
		}

		if (e.getSource() == jbtn4) {
			JOptionPane.showConfirmDialog(this, "�޽��� ��ȭ����");
		}

	}

	public static void main(String[] args) {
		ActionEventTest aet = new ActionEventTest();
		aet.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
