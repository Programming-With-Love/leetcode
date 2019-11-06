package Algorithm.leetcode.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No349 {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> twoset = new HashSet<>();
		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			if (set.contains(nums2[i])) {
				twoset.add(nums2[i]);
			}
		}
		int j = 0;
		int[] arr = new int[twoset.size()];
		for (Integer num : twoset) {
			arr[j++] = num;
		}
		return arr;
	}
}
