package Algorithm.leetcode.DP;

/**
 * 分析：sumRange被频繁的调用，这里采用构造方法时候就算法0到每个元素的值时间复杂度为O(n)，这样sumRange方法每次调用的时间复杂度为常数。
 * 
 * Created by tujietg on Jul 29, 2019
 */
public class No303 {

	class NumArray {

		private int[] nums;

		public NumArray(int[] nums) {
			// 计算0到每个位数的和
			for (int i = 1; i < nums.length; i++) {
				nums[i] += nums[i - 1];
			}

			this.nums = nums;
		}

		public int sumRange(int i, int j) {
			if (i == 0)
				return nums[j];
			return nums[j] - nums[i - 1];
		}
	}

}
