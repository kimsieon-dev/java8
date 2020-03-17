package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day20031702 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr); // 문자만 입력 받을 수 있다.(숫자도 문자로 인식)
		
		System.out.println("키보드를 눌러서 문자열을 입력해 주세요.");
		String str = br.readLine();
		System.out.println(str);
		
		System.out.println("숫자를 입력해 주세요.");
		String number = br.readLine();
		int num1 = Integer.parseInt(number); // 문자열을 숫자로 변경하는 메소드
		System.out.println(number + 10);
		System.out.println(num1 + 10);
		
		br.close();
		isr.close();
	}
}
