package Algorithm.leetcode.Array;

import java.util.Arrays;

/**
 * 
 * Created by tujietg on Nov 5, 2019
 */
public class No1051 {
	public static int heightChecker(int[] heights) {
		int[] heightsSort = new int[heights.length];
		for (int i = 0; i < heights.length; i++) {
			heightsSort[i] = heights[i];
		}
		Arrays.sort(heights);
		int sum = 0;
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != heightsSort[i]) {
				sum++;
			}
		}
		return sum;
	}

}
