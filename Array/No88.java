package Algorithm.leetcode.Array;

import java.util.Arrays;

public class No88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int k = m + n;
		int a = n - 1;
		for (int i = m; i < k; i++) {
			nums1[i] = nums2[a--];
		}
		Arrays.sort(nums1);
	}

	public void merge01(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1, j = n - 1, k = m + n - 1;
		while (i > -1 && j > -1) {
			if (nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
			} else {
				nums1[k--] = nums2[j--];
			}
		}
		while (j > -1) {
			nums1[k--] = nums2[j--];
		}
	}
}
