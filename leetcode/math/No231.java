package Algorithm.leetcode.math;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No231 {
	public boolean isPowerOfTwo(int n) {
		return n > 0 && ((n & (n - 1)) == 0);
	}
}
