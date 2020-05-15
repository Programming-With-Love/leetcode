package Algorithm.leetcode.DP;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No392 {
	public boolean isSubsequence(String s, String t) {

		if (s == null || s.length() == 0) {
			return true;
		}
		int idx = 0;
		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) == s.charAt(idx)) {
				idx++;
			}
			if (idx == s.length()) {
				return true;
			}
		}
		return s.length() == idx;
	}
}
