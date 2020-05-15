package Algorithm.leetcode.String;

/**
 * 
 * Created by tujietg on Oct 30, 2019
 */
public class No1071 {
	public String gcdOfStrings(String str1, String str2) {
		if (str2.length() > str1.length()) {
			return gcdOfStrings(str2, str1);
		}

		if (str2.length() == 0) {
			return str1;
		}

		if (str1.startsWith(str2)) {
			while (str1.startsWith(str2)) {
				str1 = str1.substring(str2.length());
			}
			return gcdOfStrings(str2, str1);
		} else {
			return "";
		}
	}
}
