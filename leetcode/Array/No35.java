package Algorithm.leetcode.Array;

public class No35 {
	public int searchInsert(int[] nums, int target) {
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (target > nums[i]) {
				k++;
			}
		}
		return k;
	}

	public int searchInsertOther(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
			if (nums[0] > target) {
				return 0;
			}
			if (nums[nums.length - 1] < target) {
				return nums.length;
			}
			if (nums[i] < target && target < nums[i + 1]) {
				return i + 1;
			}
		}
		return -1;
	}

}
