package day200331;

public class MemberService {
	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		if(id.equals("hong")) {
			System.out.println(id + " ·Î±×¾Æ¿ô µÇ¼Ì½À´Ï´Ù.");
		}
	}
}
