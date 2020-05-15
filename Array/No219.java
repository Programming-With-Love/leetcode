package Algorithm.leetcode.Array;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (i > k) {
				set.remove(nums[i - k - 1]);
			}
			if (!set.add(nums[i])) {
				return true;
			}
		}
		return false;
	}
}
