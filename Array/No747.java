package Algorithm.leetcode.Array;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No747 {
	public int dominantIndex(int[] nums) {
		// 找出最大的值與第二大的值的雙倍作比較
		int one = 0;
		int two = 0;
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > one) {
				two = one;
				one = nums[i];
				index = i;
			} else if (nums[i] > two) {
				two = nums[i];
			}
		}
		return (one >= two * 2) ? index : -1;
	}
}
