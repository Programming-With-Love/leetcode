package Algorithm.leetcode.String;

import java.util.HashMap;
import java.util.Map;

public class No205 {
	public boolean isIsomorphic(String s, String t) {
		if (s.length() <= 1 || s == null) {
			return true;
		}
		Map<Character, Character> hashMap = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			char b = t.charAt(i);
			if (hashMap.containsKey(a)) {
				if (hashMap.get(a).equals(b)) {
					continue;
				} else {
					return false;
				}
			} else {
				if (!hashMap.containsValue(b)) {
					hashMap.put(a, b);
				} else {
					return false;
				}
			}
		}
		return true;
	}
}
