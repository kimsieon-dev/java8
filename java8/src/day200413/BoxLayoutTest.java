package day200413;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class BoxLayoutTest extends JFrame {
	public BoxLayoutTest() {
		super("�ڽ� ���̾ƿ�");
		// �������� ������Ʈ �߰� 
		Box hBox = Box.createHorizontalBox(); // �������� �迭�ϴ� �ڽ�
		hBox.add(Box.createHorizontalStrut(30)); // ����ũ�� ������Ʈ
		hBox.add(new JCheckBox("�츮��������"));
		hBox.add(Box.createHorizontalStrut(30));
		hBox.add(new JCheckBox("�Ｚ����"));
		hBox.add(Box.createHorizontalStrut(30));
		hBox.add(new JCheckBox("�������"));
		hBox.add(Box.createGlue()); // ũ�⺯ȯ�ϴ� ������Ʈ

		JPanel lpanel = new JPanel(new BorderLayout()); // �������̾ƿ��� ����ϴ� �г�
		lpanel.setBorder(new TitledBorder(new EtchedBorder(), "����ȸ�� ����")); // �ܰ���
		lpanel.add(hBox, BorderLayout.CENTER); // �гο� �ڽ� ����

		// �������� ������Ʈ �߰�
		Box hhBox = Box.createHorizontalBox();
		hhBox.add(Box.createHorizontalStrut(30));
		hhBox.add(new JCheckBox("��������"));
		hhBox.add(Box.createHorizontalStrut(30));
		hhBox.add(new JCheckBox("��ȯ����"));
		hhBox.add(Box.createHorizontalStrut(30));
		hhBox.add(new JCheckBox("�������"));
		hhBox.add(Box.createGlue());

		JPanel llpanel = new JPanel(new BorderLayout());
		llpanel.setBorder(new TitledBorder(new EtchedBorder(), "���� ����"));
		llpanel.add(hhBox, BorderLayout.CENTER);

		// �������� �г��߰�
		Box cBox = Box.createVerticalBox();
		cBox.add(lpanel); // �г� �߰�
		cBox.add(llpanel); // �г� �߰�
		add(cBox, BorderLayout.CENTER); // �����ӿ� �߰�
	}

	public static void main(String[] args) {
		BoxLayoutTest blt = new BoxLayoutTest();
		blt.setDefaultCloseOperation(EXIT_ON_CLOSE);
		blt.setSize(400, 200);
		blt.setVisible(true);
	}
}
