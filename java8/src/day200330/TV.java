package day200330;

public class TV {
	// 필드
	String company;
	int year;
	int inch;
	
	// 생성자
	TV(String company, int year, int inch) {
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	// 메소드
	void show() {
		System.out.println(company + "에서 만든 " + 2017 + "년형" + "32" + "인치 TV");
	}
}
