package Algorithm.leetcode.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Created by tujietg on Sep 24, 2019
 */
public class No859 {
	public static void main(String[] args) {
		System.out.println(buddyStrings("ab", "ab"));
	}

	public static boolean buddyStrings(String A, String B) {

		if (A.length() != B.length()) {
			return false;
		}

		if (A.equals(B)) {
			Set<Character> set = new HashSet<Character>();
			char[] arrs = A.toCharArray();
			for (char item : arrs) {
				set.add(item);
				return set.size() < A.length();
			}
		}

		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) != B.charAt(i)) {
				array.add(i);
			}
		}
		return array.size() == 2 && A.charAt(array.get(0)) == B.charAt(array.get(1))
				&& B.charAt(array.get(0)) == A.charAt(array.get(1));

	}
}
