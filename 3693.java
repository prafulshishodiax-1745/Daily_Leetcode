class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n + 1];

        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            int cost1 = costs[i] + 1 + dp[i];

            dp[i + 1] = Math.min(
                dp[i + 1] == 0 ? Integer.MAX_VALUE : dp[i + 1],
                cost1
            );

            if (i + 2 <= n) {
                int cost2 = dp[i] + costs[i + 1] + 4;
                dp[i + 2] = dp[i + 2] == 0
                    ? cost2
                    : Math.min(dp[i + 2], cost2);
            }

            if (i + 3 <= n) {
                int cost3 = dp[i] + costs[i + 2] + 9;
                dp[i + 3] = dp[i + 3] == 0
                    ? cost3
                    : Math.min(dp[i + 3], cost3);
            }
        }

        return dp[n];
    }
}
