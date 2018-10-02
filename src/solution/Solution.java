package solution;

public class Solution {

	public static int solution(String S) {

		String[] phrases = S.split("\\.|\\?|!"); 

		int max = 0;

		for (int i = 0; i < phrases.length; i++) {

			String[] words = phrases[i].split(" "); 

			int length = 0;

			if (i == 0 && words[0].charAt(0) == ' ')
				length = words.length;
			else
				length = words.length - 1;
			if (words.length > max)
				max = length;
		}

		return max;
	}

	public static void main(String[] args) {

		// String S = "We test coders. Give us a try?";

		// System.out.print(solution(S));

		String S = "Forgot  Cvs..Save time . x x";

		System.out.print(solution(S));

		// String S = "We test coders. Give us a try?";

		// System.out.print(solution(S));

		// String S = "We test coders. Give us a try?";

		// System.out.print(solution(S));

	}

}
