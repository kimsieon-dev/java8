package java8;

public class Day20031903 {
	public static void main(String[] args) {
		int number = 10;
		String isOk = "";

		if (number == 1) {
			isOk = "ã�ҽ��ϴ�.";
		} else if (number == 2) {
			isOk = "ã�ҽ��ϴ�.";
		} else if (number == 3) {
			isOk = "ã�ҽ��ϴ�.";
		} else if (number == 4) {
			isOk = "ã�ҽ��ϴ�.";
		} else if (number == 5) {
			isOk = "ã�ҽ��ϴ�.";
		} else if (number == 6) {
			isOk = "ã�ҽ��ϴ�.";
		} else if (number == 7) {
			isOk = "ã�ҽ��ϴ�.";
		} else if (number == 8) {
			isOk = "ã�ҽ��ϴ�.";
		} else if (number == 9) {
			isOk = "ã�ҽ��ϴ�.";
		} else {
			isOk = "ã�ҽ��ϴ�.";
		}
		System.out.println(isOk);

		if (number > 5) {
			// 6, 7, 8, 9, 10
			if (number > 7) {
				// 8, 9, 10
			}
			if (number > 9) {
				// 10
			} else {
				// 8, 9
				if (number > 8) {
					// 8
				} else {
					// 9
				}
			}

		} else {
			// 1, 2, 3, 4, 5
			if (number > 2) {
				// 3, 4, 5
			} else {
				// 1, 2
			}
		}
	}
}
