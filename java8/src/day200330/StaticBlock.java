package day200330;

public class StaticBlock {
	static String company = "�Ｚ";
	static String kind = "LCD";
	static String product = company + " - " + kind; // ���� ���׷��̵� �� ����
	static String pro2;
	
	// java8 �����϶�
	static {
		pro2 = company + " - " + kind;
	}
}
