package day200402;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Hangman {
	private String hiddenString; // ����
	private StringBuffer outputString; // ȭ�� ���
	private StringBuffer inputString; // �Է��� ����
	private int remainder; // ���� ���� ��
	private int failed; // Ʋ�� Ƚ��
	private Scanner sc;
	private String inputData;

	public Hangman() {
		this("hello");
	}

	public Hangman(String solution) {
		hiddenString = solution; // ���� �ʱ�ȭ
		outputString = new StringBuffer();
		inputString = new StringBuffer();
		remainder = hiddenString.length();
		failed = 0;
		sc = new Scanner(System.in);
		inputData = "";
		for (int i = 0; i < remainder; i++) {
			outputString.append("_");
		}
	}

	public void playGame() {
		System.out.println("��� ������ �����մϴ�.");
		show();
		do {
			do {
				setInputData();
			} while (checkChar(inputData));
			processGame();
			show();
		} while (failed < 6 && remainder > 0);
		System.out.println("��� ������ �����մϴ�.");
	}

	private void show() {
		System.out.println("Ʋ�� Ƚ�� : " + failed + "/6");
		System.out.println(outputString);
	}

	private void setInputData() {
		System.out.println("���ڸ� �Է����ּ���.");
		this.inputData = sc.next().substring(0, 1);
	}

	private boolean checkChar(String inputDate) {
		if (inputString.indexOf(inputDate) == -1) {
			inputString.append(inputDate);
			return false;
		}
		System.out.println("�̹� �Է��� �����Դϴ�.");
		System.out.println();
		return true;
	}

	private void processGame() {
		if (hiddenString.indexOf(inputData) == -1) {
			failed++;
		} else {
			int index = hiddenString.indexOf(inputData);
			do {
				outputString.setCharAt(index, inputData.charAt(0));
				remainder--;
				index = hiddenString.indexOf(inputData, index + 1);
			} while (index != -1);
		}
	}
}
