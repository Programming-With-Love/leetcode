package Algorithm.leetcode.Array;

/**
 * 
 * Created by tujietg on Oct 31, 2019
 */
public class No268 {

	public static int missingNumber(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++)
			sum += nums[i] - i;
		return nums.length - sum;
	}

	public static void main(String[] args) {
		System.out.println(missingNumber(new int[] { 0, 2, 3, 4 }));
	}

}
