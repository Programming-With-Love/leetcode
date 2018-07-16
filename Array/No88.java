package Array;
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
}