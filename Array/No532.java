package Algorithm.leetcode.Array;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Created by tujietg on Nov 14, 2019
 */
public class No532 {
	public int findPairs(int[] nums, int k) {
		Set<Integer> hashSet = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (Math.abs(nums[i] - nums[j]) == k) {
					if (nums[i] > nums[j]) {
						hashSet.add(nums[j]);
					} else {
						hashSet.add(nums[i]);
					}
				}
			}
		}
		return hashSet.size();
	}

	public static int findPairs02(int[] nums, int k) {
		if (k < 0)
			return 0;
		Set<Integer> numbers = new HashSet<>();
		Set<Integer> found = new HashSet<>();
		for (int n : nums) {
			if (numbers.contains(n + k))
				found.add(n);
			if (numbers.contains(n - k))
				found.add(n);
			numbers.add(n - k);
		}
		return found.size();
	}

}
