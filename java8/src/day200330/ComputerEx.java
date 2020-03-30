package day200330;

public class ComputerEx {
	public static void main(String[] args) {
		Computer com = new Computer();
		int[] arr = { 10, 20, 30 };
		int res = com.sum(arr);
		System.out.println(res);

		int res2 = com.sum(new int[] { 10, 20, 30, 40, 50 });
		System.out.println(res2);

		int res3 = com.sum2(arr);
		System.out.println(res3);
		
		int res4 = com.sum2(new int[] { 10, 20, 30, 40, 50 });
		System.out.println(res4);
		
		int res5 = com.sum2(10, 20, 30, 40, 50);
		System.out.println(res5);
		
//		int res6 = com.sum(10, 20, 30); -> 사용 못함
	}
}
