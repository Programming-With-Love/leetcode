package Algorithm.leetcode.String;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No657 {
	public boolean judgeCircle(String moves) {
		char[] movesChar = moves.toCharArray();
		int r = 0, l = 0, u = 0, d = 0;
		for (char item : movesChar) {
			switch (item) {
			case 'R':
				r++;
				break;
			case 'L':
				l++;
				break;
			case 'U':
				u++;
				break;
			case 'D':
				d++;
				break;
			}
		}

		if (r - l == 0 && u - d == 0) {
			return true;
		}
		return false;
	}
}
