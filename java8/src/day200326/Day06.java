package day200326;

public class Day06 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int[][] ary = { { 10, 20 }, { 30, 40 }, { 50, 60 }, { 70, 80 } };
		// new int[4][2];

		System.out.println(ary.length);
		System.out.println(ary[0].length);
		System.out.println(ary[1].length);
		System.out.println(ary[2].length);
		System.out.println(ary[3].length);

		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				System.out.println(ary[i][j]);
			}
		}
		System.out.println("==========");

		int[][] ary2 = { { 10, 20, 30 }, { 40 }, { 50, 60 } };
		
		for(int i=0; i < ary2.length; i++) { // 길이가 다를땐 length 사용
			for(int j=0; j < ary2[i].length; j++) {
				System.out.println(ary2[i][j]);
			}
		}
	}
}
