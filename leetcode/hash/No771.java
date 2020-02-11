package Algorithm.leetcode.hash;

import java.util.HashSet;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No771 {
	public int numJewelsInStones(String J, String S) {
		int result = 0;
		HashSet hashSet = new HashSet();
		for (char j : J.toCharArray()) {
			hashSet.add(j);
		}
		for (char s : S.toCharArray()) {
			if (hashSet.contains(s)) {
				result++;
			}
		}
		return result;
	}
}
