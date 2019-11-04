package Algorithm.leetcode.String;

/**
 * 
 * Created by tujietg on Nov 4, 2019
 */
public class No1247 {
	public static int minimumSwap(String s1, String s2) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i) && s1.charAt(i) == 'x') {
				++a;
				System.out.println(a);
			}
			if (s1.charAt(i) != s2.charAt(i) && s1.charAt(i) == 'y') {
				++b;
				System.out.println(b);
			}
		}
		if (a % 2 == 0 && b % 2 == 0) {
			return a / 2 + b / 2;
		} else if (a % 2 == 1 && b % 2 == 1) {
			return a / 2 + b / 2 + 2;
		} else {
			return -1;
		}
	}


}
