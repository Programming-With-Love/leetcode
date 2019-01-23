class No198 {
	public int rob(int[] nums) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				a = Math.max(nums[i] + a, b);
			} else {
				b = Math.max(a, nums[i] + b);
			}
		}
		return Math.max(a, b);
	}
}