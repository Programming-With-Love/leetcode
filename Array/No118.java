package Algorithm.leetcode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Created by tujietg on Nov 13, 2019
 */
public class No118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> end, pre = null;
		for (int i = 0; i < numRows; i++) {
			end = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					end.add(1);
				} else {
					end.add(pre.get(j - 1) + pre.get(j));
				}
			}
			pre = end;
			result.add(end);
		}
		return result;
	}
}
