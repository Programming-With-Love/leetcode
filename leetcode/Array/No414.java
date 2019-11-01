package Algorithm.leetcode.Array;

import java.util.HashSet;

/**
 * 
 * Created by tujietg on Nov 1, 2019
 */
public class No414 {
	public static int thirdMax(int[] nums) {

		int max = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int three = Integer.MIN_VALUE;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
			if (nums[i] > max) {
				three = second;
				second = max;
				max = nums[i];
			} else if (nums[i] > second && nums[i] < max) {
				three = second;
				second = nums[i];
			} else if ((nums[i] > three && nums[i] < second)) {
				three = nums[i];
			}
		}
		if (three == Integer.MIN_VALUE && set.size() < 3) {
			return max;
		} else {
			return three;
		}
	}

	public static void main(String[] args) {
		System.out.println(thirdMax(new int[] { 5, 2, 4, 1, 3, 6, 0 }));
	}
}
