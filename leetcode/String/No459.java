package Algorithm.leetcode.String;

/**
 * @author tujietg
 * @date 2019/9/5 7:42 PM
 */
public class No459 {

	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("abab"));
	}

	public static boolean repeatedSubstringPattern(String s) {
		System.out.println(s);
		if (s == null || s.length() == 1) {
			return false;
		}
		String newStr = s + s;
		System.out.println(newStr.substring(1, newStr.length() - 1));
		return newStr.substring(1, newStr.length() - 1).contains(s);
	}

}
