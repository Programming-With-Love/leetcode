package Algorithm.leetcode.String;

/**
 * 本题注意 空间复杂度为O(1)
 * 
 * Created by tujietg on Aug 2, 2019
 */
public class No344 {
	public void reverseString(char[] s) {
		if (s.length == 0 || s.length == 1) {
			return;
		}
		int midLen = s.length / 2;
		for (int i = 0; i < s.length; i++) {
			if (i < midLen) {
				char cent = '0';
				cent = s[i];
				s[i] = s[s.length - 1 - i];
				s[s.length - 1 - i] = cent;
			}
		}
	}
}
