package Algorithm.leetcode.Array;

/**
 * 
 * Created by tujietg on Nov 3, 2019
 */
public class No905 {
	public int[] sortArrayByParity(int[] A) {
		int a = 0;
		int b = A.length - 1;
		int[] end = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				end[a++] = A[i];
			} else {
				end[b--] = A[i];
			}
		}
		return end;
	}

	public static void main(String[] args) {
		System.out.println(0 / 2);
	}
}
