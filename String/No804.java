package Algorithm.leetcode.String;

import java.util.HashSet;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No804 {
	public int uniqueMorseRepresentations(String[] words) {
		String[] strArray = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		HashSet<String> set = new HashSet<String>();
		for (String item : words) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < item.length(); i++) {
				sb.append(strArray[item.charAt(i) - 'a']);
			}
			set.add(sb.toString());
		}
		return set.size();
	}
}
