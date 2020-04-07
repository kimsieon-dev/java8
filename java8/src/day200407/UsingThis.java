package day200407;

public class UsingThis {
	int outerField = 10;

	class Inner {
		int innerField = 20;

		 void method() {
			// ¶÷´Ù½Ä
			Functional fi = () -> {
				System.out.println("outerField : " + outerField);
				System.out.println("outerField : " + UsingThis.this.outerField + "\n");
				System.out.println("innerField : " + innerField);
				System.out.println("innerField : " + this.innerField + "\n");
			};
			fi.method();
			
//			Functional fi2 = new Functional() {
//				
//				@Override
//				public void method() {
//					System.out.println("outerField : " + outerField);
//					System.out.println("outerField : " + UsingThis.this.outerField + "\n");
//					System.out.println("innerField : " + innerField);
//					System.out.println("innerField : " + this.innerField + "\n");
//				}
//			};
//			fi2.method();
		}
	}
}
