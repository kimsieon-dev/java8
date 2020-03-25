package day200325;

public class Day02 {
	public static void main(String[] args) {
		/*
		 * System.out.printf�� ����(format)�� �°� ����ϴ� �޼ҵ��Դϴ�.
		 * printf�� C���� ������� ����ϴ� �޼ҵ��ε� �ڹٿ����� ����� �� �ֽ��ϴ�.
		 * ù��° �μ�(�Է°�)�� ��� ������ �Է��ϰ� �ι�°���ʹ� ������Ŀ� ������ ������ �Է��մϴ�.
		 * 
		 * ������ ������ %�� �����մϴ�.
		 * d -> decimal 10����
		 * f -> float �Ǽ�
		 * lf -> long float -> double �Ǽ� //C����, �ڹٿ����� �Ұ���
		 * o -> octa 8����
		 * x -> hexa 16����
		 * b -> binary 2����
		 * s -> String ���ڿ�
		 * c -> char ���� 1��
		 * 
		 * ������ �� �ִ°�
		 * ���ʿ� ���ڸ� �Է��ϸ� �ڸ����� ����
		 * %2d -> 2�ڸ� ���, %10d -> �������� 10�ڸ��� ���
		 * ���� �տ� 0�� ���̸� ������� 0���� ä��ϴ�. �ٸ� ���ڴ� ��� �Ұ���
		 * ���� �տ� -�� ���̸� ��������
		 */
		
		int i;
		int j;
		int cnt = 1;
		
		for(i = 1; i <= 25; i++) {
			System.out.print(i + "\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println("==========");
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				System.out.printf("%02d ", cnt);
				cnt++;
			}
			System.out.println();
		}
		System.out.println("==========");
		
		cnt = 1;
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++) {
				if(i % 2 == 0) {
					System.out.print((i * 5) + j + 1 + "\t");
				}else {
					System.out.print((i + 1) * 5 - j + "\t");
				}
			}
			System.out.println();
		}
		System.out.println("==========");
		
		/*
		 * @
		 *  @
		 *   @
		 *    @
		 *     @
		 */
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				if(i == j) {
					System.out.print("@");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("==========");
		
		
	}
}



