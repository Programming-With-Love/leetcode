package Algorithm.leetcode.Array;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No724 {
	public int pivotIndex(int[] nums) {
		int sum = 0;
		int left = 0;
		// 计算数组的总和
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			if (i != 0) {
				left += nums[i - 1];
			}
			if (sum - left - nums[i] == left) {
				return i;
			}
		}
		return -1;
	}
}
