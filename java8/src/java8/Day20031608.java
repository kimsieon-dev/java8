package java8;

public class Day20031608 {
	public static void main(String[] args) {
		int daegu = 2_000_000; // _ -> 인식안함 
		int global = 1_000_000;

		String str = daegu >= global ? "대구광역시" : "대구시";
		System.out.println(str);
	}
}
