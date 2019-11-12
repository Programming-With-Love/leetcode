package Algorithm.leetcode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Created by tujietg on Nov 12, 2019
 */
public class No1002 {
	public static List<String> commonChars(String[] A) {
		int[] endArr = new int[26];
		// 找出第一组的数
		for (char c : A[0].toCharArray()) {
			endArr[c - 'a']++;
		}
		for (int i = 1; i < A.length; i++) {
			int[] midArr = new int[26];
			for (char c : A[i].toCharArray()) {
				midArr[c - 'a']++;
			}
			for (int j = 0; j < 26; j++) {
				if (endArr[j] == 0 || midArr[j] == 0) {
					endArr[j] = 0;
				} else {
					endArr[j] = Math.min(endArr[j], midArr[j]);
				}
			}
		}
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 26; i++) {
			if (endArr[i] != 0) {
				for (int j = 0; j < endArr[i]; j++) {
					list.add((char) (i + 'a') + "");
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		String[] str = new String[] { "daaccccd", "adacbdda", "abddbaba", "bacbcbcb", "bdaaaddc", "cdadacba",
				"bacbdcda", "bacdaacd" };
		commonChars(str);
	}
}
