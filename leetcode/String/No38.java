package Algorithm.leetcode.String;

/**
 * 
 * Created by tujietg on Oct 28, 2019
 */
public class No38 {
	public static String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}
		String str = countAndSay(n - 1) + "*";
		char[] charArr = str.toCharArray();
		int count = 1;
		String s = "";
		for (int i = 0; i < charArr.length - 1; i++) {
			if (charArr[i] == charArr[i + 1]) {
				count++;
			} else {
				s = s + count + charArr[i];
				count = 1;
			}
		}
		return s;
	}
}
