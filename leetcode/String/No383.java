package Algorithm.leetcode.String;

/**
 * 
 * Created by tujietg on Oct 29, 2019
 */
public class No383 {
	public boolean canConstruct(String ransomNote, String magazine) {
		int[] mid = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			mid[magazine.charAt(i) - 'a']++;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			if (--mid[ransomNote.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}
}
