package day200409;

import java.awt.Graphics;

import javax.swing.JPanel;

public class ParamJApplet extends JPanel {
	private static final long serialVersionUID = 1L;
	/*
	 * Ŭ������ �����ѹ��� ���� Ŭ������ ��ü�� ������ ���۽� 
	 * �۽źο��� ���� Ŭ�������� Ȯ���ϱ� ���Ͽ� ����Ѵ�. 
	 * ������� ������ ��������
	 * �����Ѵ�.
	 */

	String title;

	public void init(String title) {
		this.title = title;
		if (title == null)
			title = "���޹��� �μ��� ����.";
	}

	public void paint(Graphics g) {
		g.drawString(title, 100, 100);
	}
}
