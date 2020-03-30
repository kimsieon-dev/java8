package day200330;

public class CallByReference {
	public static void main(String[] args) {
		CallByReference cv = new CallByReference();
		int[] arr = { 10, 20, 30, 40, 50 };
		int res2 = cv.sum(arr);
		System.out.println(res2);
		int sum = 0;
		for (int n : arr) {
			sum += n;
		}
		System.out.println(sum);
	}
	
	int sum(int[] arr) {
		arr[2] = 330;
		int sum = 0;
		for (int n : arr) {
			sum += n;
		}
		return sum;
	}
}
