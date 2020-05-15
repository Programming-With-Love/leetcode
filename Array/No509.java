package Algorithm.leetcode.Array;

/**
 * 
 * Created by tujietg on Nov 2, 2019
 */
public class No509 {
	public int fib(int N) {
		if (N == 0) {
			return 0;
		}

		if (N == 1) {
			return 1;
		}
		return fib(N - 1) + fib(N - 2);
	}
}
