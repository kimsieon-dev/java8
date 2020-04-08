package programmers;

public class Solution003 {
	public int[] solution003(int[] answers) {
		int[][] person = new int[][] {

				new int[] { 1, 2, 3, 4, 5 }, 
				new int[] { 2, 1, 2, 3, 2, 4, 2, 5 },
				new int[] { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };

		int[] cnt = new int[3];

		for (int i = 0; i < person.length; i++) {
			for (int j = 0; j < answers.length; j++) {
				if (answers[j] == person[i][(j % person[i].length)]) {
					cnt[i]++;
				}
			}
		}
		String str = "";
		if (cnt[0] >= cnt[1] && cnt[0] >= cnt[2]) {
			str += 1;
		}
		if (cnt[1] >= cnt[0] && cnt[1] >= cnt[2]) {
			str += 2;
		}
		if (cnt[2] >= cnt[0] && cnt[2] >= cnt[1]) {
			str += 3;
		}
		int[] answer = new int[str.length()];
		String[] arr = str.split("");
		for (int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(arr[i]);
		}
		return answer;
	}
}
