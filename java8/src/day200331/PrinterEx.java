package day200331;

public class PrinterEx {
	public static void main(String[] args) {
		// 첫번째 방법
		Printer p = new Printer();
		p.println(10);
		p.println(true);
		p.println(3.14);
		p.println("hello");

//	두번째 방법
//		Printer.println(10);
//		Printer.println(true);
//		Printer.println(3.14);
//		Printer.println("hello");
	}
}
