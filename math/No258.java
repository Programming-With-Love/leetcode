package Algorithm.leetcode.math;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No258 {
	public int addDigits(int num) {
		return num == 0 ? 0 : (num % 9 == 0 ? 9 : num % 9);
	}
}
