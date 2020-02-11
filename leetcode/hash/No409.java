package Algorithm.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No409 {
	// 采用HashSet解决
	public int longestPalindrome(String s) {
		Set<Character> hs = new HashSet<>();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (hs.contains(s.charAt(i))) {
				hs.remove(s.charAt(i));
				count++;
			} else {
				hs.add(s.charAt(i));
			}
		}
		if (!hs.isEmpty()) {
			return count * 2 + 1;
		} else {
			return count * 2;
		}
	}
}
