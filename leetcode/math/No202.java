package Algorithm.leetcode.math;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No202 {
	public boolean isHappy(int n) {
		Set set = new HashSet();
		while (n != 1 && !set.contains(n)) {
			set.add(n);
			int temp = 0;
			while (n != 0) {
				temp += Math.pow(n % 10, 2);
				n = n / 10;
			}
			n = temp;
		}
		return n == 1;
	}
}
