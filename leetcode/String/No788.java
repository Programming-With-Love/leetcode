package Algorithm.leetcode.String;

/**
 * @author tujietg
 * @date 2019/9/20 2:43 PM
 */
public class No788 {
	public static int rotatedDigits(int N) {
		int count = 0;
		for (int i = 1; i <= N; i++) {
			String a = String.valueOf(N);
			if ((a.contains("2") || a.contains("5") || a.contains("6") || a.contains("9"))
					&& (!a.contains("3") && !a.contains("4") && !a.contains("7"))) {
				count++;
			}
		}
		return count;
	}
}
