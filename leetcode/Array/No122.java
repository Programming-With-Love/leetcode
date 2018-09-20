package Array;

public class No122 {
	public int maxProfit(int[] prices) {
		int min = prices[0];
		int mid = 0;
		int len = prices.length;
		if (len < 2) {
			return 0;
		}
		for (int i = 1; i < len; i++) {
			min = Math.min(prices[i], min);
			if (prices[i] > min) {
				mid += prices[i] - min;
				min = prices[i];
			}
		}
		return mid;
	}
}
