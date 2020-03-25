package day200325;

public class Day04 {
	public static void main(String[] args) {
		/*
		 * for문을 사용해서 a ~ z까지 출력
		 * abcdefghijklmnopqrstuvwxyz 각
		 * ABCDEFGHIJKLMNOPQRSTUVWXYZ 각
		 * 형변환이 필요
		 */
		
	
		char i;
		char j;
		
		for(i = 97; i <= 122; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		for(i = 65; i <= 90; i++) {
			System.out.print(i);
		}
	}
}
