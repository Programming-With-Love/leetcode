package Algorithm.leetcode.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * Created by tujietg on Nov 8, 2019
 */
public class No448 {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> hashSet = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			hashSet.add(nums[i]);
		}
		int n = nums.length;
		for (int i = 1; i <= n; i++) {
			if (!hashSet.contains(i)) {
				list.add(i);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] param = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
		findDisappearedNumbers(param);
	}
}
