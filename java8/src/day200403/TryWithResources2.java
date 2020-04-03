package day200403;

import java.io.File;
import java.util.Scanner;

public class TryWithResources2 {
	public void getData(String file) {
		try (Scanner sc = new Scanner(new File(file)); 
			Scanner sc2 = new Scanner(System.in); // �������� �ڵ� ���� �ҽ��� �ۼ��� �� �ִ�.
				) {
			System.out.println(sc.nextLine());
		} catch (Exception e) {
			System.err.println("���ܹ߻�");
			System.out.println();
			e.getMessage();
			System.out.println();
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TryWithResources2 twr = new TryWithResources2();
		twr.getData("test.txt");
	}
}