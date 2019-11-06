package Algorithm.leetcode.Array;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No167 {
	public int[] twoSum(int[] numbers, int target) {
		int[] end = new int[2];
		if (numbers.length < 2) {
			return end;
		}
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			int num = numbers[left] + numbers[right];
			if (num == target) {
				end[0] = left + 1;
				end[1] = right + 1;
				return end;
			} else if (num > target) {
				right--;
			} else {
				left++;
			}
		}
		return end;
	}
}
