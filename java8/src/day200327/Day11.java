package day200327;

import java.util.Random;

public class Day11 {
	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		
		for(int i=2; i < arr.length; i++) {
			System.out.println(i + "´Ü");
			for(int j = 1; j < arr[i].length; j++) {
				arr[i][j] = i * j;
				
				System.out.print(i + " X " + j + " = " + arr[i][j]);
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("==========");
		
		int[][] arr2 = new int[8][9];
		
		for(int i=0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = (i+2) * (j+1);
			}
		}
		for(int i = 0; i <arr2.length; i++) {
			for(int j = 0; j <arr2[i].length; j++) {
				System.out.print((i+2) + " X " + (j+1) + " = " + arr2[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
