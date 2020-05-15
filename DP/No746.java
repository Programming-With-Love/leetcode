package Algorithm.leetcode.DP;

/**
 * 
 * Created by tujietg on Aug 1, 2019
 */
public class No746 {
	public int minCostClimbingStairs(int[] cost) {
		if (cost.length == 0)
			return 0;

		int[] dp = new int[cost.length + 1];

		dp[0] = cost[0];
		dp[1] = cost[1];
		for (int i = 2; i < cost.length; i++) {
			dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
		}

		dp[cost.length] = Math.min(dp[cost.length - 1], dp[cost.length - 2]) + dp[cost.length];
		return dp[cost.length];
	}
}
