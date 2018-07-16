package Array;

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
}
