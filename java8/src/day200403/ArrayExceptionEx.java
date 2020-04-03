package day200403;

public class ArrayExceptionEx {
	public static void main(String[] args) {
		exceptionTest();
	}

	static void exceptionTest() {
		int[] arr = new int[3];
		try {
			arr[2] = 100; // 오류 발생시 바로 catch로 이동
			System.out.println(arr[2]);
//			throw new ArrayIndexOutOfBoundsException(); // 강제적으로 예외를 발생시키려면 객체를 생성후 throw 한다.
		
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("숫자 연산이 불가능하거나 배열의 범위를 벗어났습니단.");
		} catch (Exception e) {
			System.out.println("발생된 모든 예외를 처리합니다.");
			e.printStackTrace();
		} finally { // finally - > 예외와 상관없이 무조건 실행하는 구간, 생략가능
			System.out.println("finally 구간입니다.");
		}
		
		try {
			Thread.sleep(100); // 예외처리 없이는 실행이 불가능한 코드
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
