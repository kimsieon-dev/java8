package day200330;

public class TV {
	// �ʵ�
	String company;
	int year;
	int inch;
	
	// ������
	TV(String company, int year, int inch) {
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	// �޼ҵ�
	void show() {
		System.out.println(company + "���� ���� " + 2017 + "����" + "32" + "��ġ TV");
	}
}
