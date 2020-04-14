package day200414;

import java.util.Date;

public class PrintfFormatEx {
	public static void main(String[] args) {
		int num = 10;
		double log = Math.log(num);
		System.out.format("log(%d) : % + 10.6f %n", num, log);

		Date today = new Date();
		System.out.printf("오늘 날짜 : %tY년 %tm월 %td일 \n", today, today, today);
		System.out.printf("오늘 날짜 : %1$tY년 %1$tm월 %1$td일 \n", today);
		System.out.printf("현재 시간 : %1$sH시 %1$tM분 %1$tS초 \n", today);
		System.out.format("오늘 날짜 : %tY년 %tm월 %td", today, today, today);
	}
}
