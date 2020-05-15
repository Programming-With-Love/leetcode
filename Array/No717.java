package Algorithm.leetcode.Array;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No717 {
	public boolean isOneBitCharacter(int[] bits) {
		int len = bits.length;
		int i = 0;
		while (i < len - 1) {
			// 当为零的时候，跳转到下一位。
			if (bits[i] == 0) {
				i++;
			} else {
				// 当不为零的时候，跳转两位。
				i += 2;
			}
		}
		return len - 1 == i;
	}
}
