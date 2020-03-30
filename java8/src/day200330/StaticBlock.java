package day200330;

public class StaticBlock {
	static String company = "삼성";
	static String kind = "LCD";
	static String product = company + " - " + kind; // 버전 업그레이드 후 가능
	static String pro2;
	
	// java8 버전일때
	static {
		pro2 = company + " - " + kind;
	}
}
