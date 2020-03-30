package day200330;

public class Grade {
	// 필드
	int kor;
	int eng;
	int mat;

	// 생성자
	Grade(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}

	// 메서드
	double avg() {
		int sum = kor + eng + mat;
		return sum / 3.0;

	}
}
