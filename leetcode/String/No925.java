package Algorithm.leetcode.String;

/**
 * 
 * Created by tujietg on Oct 23, 2019
 */
public class No925 {
	public boolean isLongPressedName(String name, String typed) {
		char[] nameChar = name.toCharArray();
		char[] typedChar = typed.toCharArray();
		int i = 0;
		for (int k = 0; k < typed.length(); k++) {
			if (i < name.length() && nameChar[i] == typedChar[k]) {
				i++;
			} else {
				if (k == 0 || typedChar[k] != typedChar[k - 1]) {
					return false;
				}
			}
		}
		return i == name.length();
	}
}
