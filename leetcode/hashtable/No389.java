package Algorithm.leetcode.hashtable;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No389 {
	public char findTheDifference(String s, String t) {
		int snum = 0;
		int tnum = 0;
		for (int i = 0; i < s.length(); i++) {
			snum += (int) s.charAt(i);
		}
		for (int i = 0; i < t.length(); i++) {
			tnum += (int) t.charAt(i);
		}
		int n = tnum - snum;
		return (char) n;
	}
}
