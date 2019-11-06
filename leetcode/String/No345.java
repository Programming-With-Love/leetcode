package Algorithm.leetcode.String;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No345 {
	public String reverseVowels(String s) {
		char[] list = s.toCharArray();
		Set newSet = new HashSet();
		newSet.add('a');
		newSet.add('e');
		newSet.add('i');
		newSet.add('o');
		newSet.add('u');
		newSet.add('A');
		newSet.add('E');
		newSet.add('I');
		newSet.add('O');
		newSet.add('U');
		for (int i = 0, j = list.length - 1; i < j;) {
			if (!newSet.contains(list[i])) {
				i++;
				continue;
			}
			if (!newSet.contains(list[j])) {
				j--;
				continue;
			}
			char tmp = list[i];
			list[i] = list[j];
			list[j] = tmp;
			j--;
			i++;
		}
		return String.valueOf(list);
	}
}
