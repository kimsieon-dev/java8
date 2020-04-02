package day200402;

public class SubStringEx {
	public static void main(String[] args) {
		String ssn = "888015-1234567";
		
		String fristNum = ssn.substring(0, 6);
		System.out.println(fristNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}
