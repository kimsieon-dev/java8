package java8;

import java.util.Scanner;

public class Day20031708 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("이름, 학번, 토플점수를 입력하세요.");
		String name = sc.nextLine();
		int hakbun = sc.nextInt();
		int en = sc.nextInt();
		
		System.out.println("나의 이름은 " + name + "입니다.");
		System.out.println("학번은 " + hakbun + "입니다.");
		System.out.println("그리고 토플점수는 " + en + "점 입니다.");
		
		sc.close();
	}
}
