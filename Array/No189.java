package Algorithm.leetcode.Array;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No189 {
	public void rotate(int[] nums, int k) {
		// [1,2,3,4,5,6,7] [5,6,7,1,2,3,4] k = 3；
		// 思路：第一步:数组反转，第二步， 把0-k-1 反转 第三步：k nums.length 反转
		k = k % nums.length;
		No189 s = new No189();
		s.reverse(nums, 0, nums.length - 1);
		s.reverse(nums, 0, k - 1);
		s.reverse(nums, k, nums.length - 1);

	}

	// 反轉方法
	public void reverse(int[] arr, int start, int end) {
		while (end > start) {
			int tem = 0;
			tem = arr[start];
			arr[start] = arr[end];
			arr[end] = tem;
			end--;
			start++;
		}
	}
}
