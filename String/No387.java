package Algorithm.leetcode.String;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Created by tujietg on Oct 28, 2019
 */
public class No387 {
	public static int firstUniqChar(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			} else {
				int a = map.get(ch[i]);
				map.remove(ch[i]);
				map.put(ch[i], ++a);
			}
		}

		for (int i = 0; i < ch.length; i++) {
			if (map.get(ch[i]) == 1) {
				return i;
			}
		}
		return -1;
	}

}
