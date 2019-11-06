package Algorithm.leetcode.String;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No686 {
	public int repeatedStringMatch(String A, String B) {
		String newB = reloveString(B);
		String newA = reloveString(A);
		if (newB.contains(newA)) {
			for (int a = 0; a < newB.length(); a++) {
				if (!newA.contains(newB.charAt(a) + "")) {
					return -1;
				}
			}
		}
		String mid = A;
		int a = 1;
		while (!A.contains(B)) {
			A = A + mid;
			a++;
			if (A.length() > 2 * B.length() && a >= 100) {
				return -1;
			}
		}
		return a;
	}

	public String reloveString(String de) {

		char[] chars = de.toCharArray();
		List<String> str = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < chars.length; i++) {
			if (str.contains(String.valueOf(chars[i]))) {
				continue;
			} else {
				str.add(String.valueOf(chars[i]));
				sb.append(String.valueOf(chars[i]));
			}
		}
		return sb.toString();

	}

}
