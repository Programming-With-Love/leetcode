package Algorithm.leetcode.String;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No521 {
	public int findLUSlength(String a, String b) {
		return a.equals(b) ? -1 : Math.max(a.length(), b.length());
	}
}
