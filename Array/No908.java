package Algorithm.leetcode.Array;

import java.util.Arrays;

public class No908 {
	public int smallestRangeI(int[] A, int K) {
		if (A.length == 0 || A.length == 1) {
			return 0;
		}
		// [2,7,2] [2,2,7] K = 1
		// [1,3,6] 3
		int len = A.length;
		Arrays.sort(A);
		if (A[len - 1] - A[0] <= 2 * K) {
			return 0;
		} else {
			return A[len - 1] - 2 * K - A[0];
		}
	}
}
