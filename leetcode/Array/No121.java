package Array;

public class No121 {
	public static void main(String[] args) {
		int[] a = { 7, 1, 5, 3, 6, 4 };
		int b = maxProfit(a);
		System.out.println(b);
	}

	public static int maxProfit(int[] prices) {
		int len = prices.length;
		if (len == 0) {
			return 0;
		}
		int mid = 0;
		int begin = prices[0];
		for (int i = 1; i < len; i++) {
			if (prices[i] < begin) {
				begin = prices[i];
			}
			if (prices[i] > begin) {
				mid = prices[i] - begin > mid ? prices[i] - begin : mid;
			}
		}
		return mid;
	}
}
