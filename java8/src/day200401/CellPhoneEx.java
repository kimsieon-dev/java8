package day200401;

public class CellPhoneEx {
	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("������20", "����", 0);
		dcp.powerOn(); // �θ�� �޼���
		dcp.bell(); // �θ�� �޼���
		dcp.sendVoice("��������?"); // �θ�� �޼���
		dcp.receiveVoice("�ù��Դϴ�."); // �θ�� �޼���
		dcp.sendVoice("�� �տ� �����ּ���."); // �θ�� �޼���
		dcp.receiveVoice("�˰ڽ��ϴ�."); // �θ�� �޼���
		dcp.hangUp(); // �θ�� �޼���
		dcp.turnOnDmb(); // �ڽ��� �޼���
		dcp.setChannel(100); // �ڽ��� �޼���
		dcp.trunOffDmb(); // �ڽ��� �޼���
		dcp.powerOff(); // �θ�� �޼���
		
		CellPhone cp = new CellPhone();
		cp.powerOn();
//		cp.turnOnDmb(); // �θ���� ��ü�� �ڽ��� �ν��Ͻ��� ȣ���� �� ����.
		cp.powerOff();
	}
}
