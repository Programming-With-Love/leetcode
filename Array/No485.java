package Algorithm.leetcode.Array;

/**
 * 
 * Created by tujietg on Nov 1, 2019
 */
public class No485 {
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int mid = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				mid++;
			} else {
				max = max > mid ? max : mid;
				mid = 0;
			}
		}
		if (max > mid) {
			return max;
		} else {
			return mid;
		}
	}
}
