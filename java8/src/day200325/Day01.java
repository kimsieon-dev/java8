package day200325;

public class Day01 {
	public static void main(String[] args) {
		int i;
		int j;
		int k;
	

		for(i = 0; i < 5; i++) {
			for(j = 0; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println("==========");
		
		for(i = 5; i > 0; i--) {
			for(j = 0; j < i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		/*
		 * ÁÂ¿ì¹ÝÀü
		 *     @
		 *    @@
		 *   @@@
		 *  @@@@
		 * @@@@@
		 */
		for(i = 1; i <= 5; i++) {
			for(j = 5; j > 0; j--) {
				if(j > i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();	
		}
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++) {
				if(i > j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(i = 1; i < 5; i++) {
			for(j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}for(j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========");
		
		for(i = 4; i >= 0; i--) {
			for(j = 0; j < i; j++) {
				System.out.print(" ");
			}for(j = 0; j < 5 - i; j++) {
				System.out.print("@");
			}for(j = 0; j < 4 - i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println("==========");
		
		for(i = 0; i < 4; i++) {
			for(j = 0; j <= i; j++) {
				System.out.print(" ");
			}for(j = 0; j < 4 - i; j++) {
				System.out.print("@");
			}for(j = 0; j < 3 - i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
