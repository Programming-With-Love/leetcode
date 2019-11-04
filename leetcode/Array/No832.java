package Algorithm.leetcode.Array;

/**
 * 
 * Created by tujietg on Nov 4, 2019
 */
public class No832 {
	public int[][] flipAndInvertImage(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			int[] B = A[i];
			for (int j = 0; j < B.length; j++) {
				if (j < B.length - j - 1) {
					int mid = B[j];
					B[j] = B[B.length - j - 1];
					B[B.length - j - 1] = mid;
				}
			}
			for (int j = 0; j < B.length; j++) {
				if (B[j] == 1) {
					B[j] = 0;
				} else {
					B[j] = 1;
				}
			}
		}
		return A;
	}
}
