package day200326;

public class Day09 {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("2개의 정수를 입력해 주세요. : ");
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
		
		String num = args[0];
		String num2 = args[1];
		int iNum = Integer.parseInt(num);
		int iNum2 = Integer.parseInt(num2);
		System.out.println("num : " + num + ", num2 : " + num2);
		System.out.println("num + num2 = " + (iNum + iNum2));
	}
}
