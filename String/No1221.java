package Algorithm.leetcode.String;

/**
 * 
 * Created by tujietg on Oct 25, 2019
 */
public class No1221 {
	public int balancedStringSplit(String s) {
		int count = 0;
		int end = 0;
		for (char item : s.toCharArray()) {
			if (item == 'L') {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				end++;
			}
		}
		return end;
	}
}
