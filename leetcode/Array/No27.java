package Array;

public class No27 {
	public int removeElement(int[] nums, int val) {
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				k++;
			} else {
				nums[i - k] = nums[i];
			}
		}
		return nums.length - k;
	}
}
