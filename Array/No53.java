package Array;

public class No53 {
	public int maxSubArray(int[] nums) {
		int mid = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			mid = 0;
			for (int j = i; j < nums.length; j++) {
				mid += nums[i];
				if (mid > max) {
					max = mid;
				}
			}
		}
		return max;
	}

	public int maxSubArray01(int[] nums) {
		int max = Integer.MIN_VALUE;
		int mid = 0;
		for (int i = 0; i < nums.length; i++) {
			if (mid < 0) {
				mid = 0;
			}
			mid += nums[i];
			if (mid > max) {
				max = mid;
			}
		}
		return max;
	}
}
