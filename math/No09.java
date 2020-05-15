package Algorithm.leetcode.math;

public class No09 {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int b = x;
		int a = 0;
		while (x != 0) {
			a = a * 10 + x % 10;
			x = x / 10;
		}
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}
}
