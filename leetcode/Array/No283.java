package Algorithm.leetcode.Array;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No283 {
	public void moveZeroes(int[] nums) {
		int tem = 0;
		for (int num : nums) {
			if (num != 0) {
				nums[tem++] = num;
			}
		}
		while (nums.length > tem) {
			nums[tem++] = 0;
		}
	}
}
