package Algorithm.leetcode.Array;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No169 {
	public int majorityElement(int[] nums) {
		int len = nums.length;
		int count = 0;
		int end = 0;
		for (int i = 0; i < len; i++) {
			if (count == 0 || end == nums[i]) {
				end = nums[i];
				count++;
			} else {
				count--;
			}
		}
		return end;
	}
}
