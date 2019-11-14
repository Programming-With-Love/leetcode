package Algorithm.leetcode.Array;

/**
 * 
 * Created by tujietg on Nov 14, 2019
 */
public class No566 {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int m = nums.length;
		int n = nums[0].length;
		if (m * n != r * c) {
			return nums;
		}
		int[][] endNums = new int[r][c];
		for (int i = 0; i < r * c; i++) {
			endNums[i / c][i % c] = nums[i / n][i % n];
		}
		return endNums;
	}
}
