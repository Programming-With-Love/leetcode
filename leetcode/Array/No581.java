package Algorithm.leetcode.Array;

import java.util.Arrays;

/**
 * 
 * Created by tujietg on Nov 15, 2019
 */
public class No581 {
	public int findUnsortedSubarray(int[] nums) {
		int start = nums.length;
		int end = nums.length;
		int[] cloneNums = nums.clone();
		Arrays.sort(cloneNums);
		for (int i = 0; i < nums.length; i++) {
			if (cloneNums[i] != nums[i]) {
				start = i;
				break;
			}
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] != cloneNums[i]) {
				end = i;
				break;
			}
		}
		return start == end ? 0 : end - start + 1;
	}
}
