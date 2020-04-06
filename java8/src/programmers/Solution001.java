package programmers;

import java.util.Arrays;

public class Solution001 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for(int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.parallelSort(temp);
			answer[i] = temp[commands[i][2] - 1];

//		for (int i = 0; i < commands.length; i++) {
//			int a = (commands[i][0]) - 1;
//			int b = (commands[i][1]);
//			int c = (commands[i][2]) - 1;
//
//			int temp[] = Arrays.copyOfRange(array, a, b);
//			Arrays.sort(temp);
//			answer[i] = temp[c];
			
			
		}
		return answer;

	}

}
