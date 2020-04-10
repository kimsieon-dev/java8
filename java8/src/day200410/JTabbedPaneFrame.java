package day200410;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class JTabbedPaneFrame extends JFrame {
	public JTabbedPaneFrame() {
		super("��� �������� ��ȸ(JTabbedPane)");
		JTabbedPane jtp = new JTabbedPane(JTabbedPane.TOP);
		JPanel jpn1 = new JPanel();
		JPanel jpn2 = new JPanel();
		JPanel jpn3 = new JPanel();
		bTable jt1 = new bTable();
		eTable jt2 = new eTable();
		fTable jt3 = new fTable();
		jpn1.add(jt1);
		jpn2.add(jt2);
		jpn3.add(jt3);

		jtp.addTab("�⺻����", jpn1);
		jtp.addTab("�߰�����", jpn2);
		jtp.addTab("���ȳ���", jpn3);

		add(jtp, BorderLayout.CENTER);

		setSize(500, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		JTabbedPaneFrame jt = new JTabbedPaneFrame();
		jt.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}

class bTable extends JPanel {
	public bTable() {
		String[] title = { "���", "����", "�μ�" };
		String[][] data = { { "1", "�̸��", "�ѹ���" }, 
				{ "2", "�̽¿�", "�λ��" }, 
				{ "3", "����ȯ", "�����" } 
				};
		JTable table = new JTable(data, title);
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js = new JScrollPane(table, v, h);
		add(js);
	}
}

// Ŭ������ �����Ͽ� '�߰� ����' �г� �����̳ʿ� �߰�
class eTable extends JPanel {
	public eTable() {
		String[] title = { "�Ի���", "�ּ�", "��ȭ" };
		String[][] data = { { "2001-01-01", "���� ���ϵ�", "303-5555" }, 
				{ "2000-05-30", "������ ��ȭ��", "555-6666" },
				{ "2008-01-01", "���α� �ŵ�����", "777-1234" } 
				};
		JTable table = new JTable(data, title);
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js = new JScrollPane(table, v, h);
		add(js);
	}
}

// Ŭ������ �����Ͽ� '���� ����' �г� �����̳ʿ� �߰�
class fTable extends JPanel {
	public fTable() {
		String[] title = { "ȣ��", "�ٹ�����" };
		String[][] data = { { "0506", "����" }, 
				{ "0401", "���" }, 
				{ "0701", "����", } 
				};
		JTable table = new JTable(data, title);
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js = new JScrollPane(table, v, h);
		add(js);
	}
}
