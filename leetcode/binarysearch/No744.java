package Algorithm.leetcode.binarysearch;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No744 {
	public char nextGreatestLetter(char[] letters, char target) {
		int len = letters.length;
		int tarInt = target - 'A' + 1;
		int lerInt = letters[len - 1] - 'A' + 1;
		if (target == 'z' || tarInt >= lerInt) {
			return letters[0];
		}
		int i;
		for (i = 1; i < len; i++) {
			int leInt = letters[i - 1] - 'A' + 1;
			if (leInt > tarInt) {
				break;
			}
		}
		return letters[i - 1];
	}

}
