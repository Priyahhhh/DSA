class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int mini = prices[0];
        int profit = 0;

        for (int i = 0; i < n; i++) {

            int cost = prices[i] - mini;  // FIXED
            profit = Math.max(profit, cost);  // FIXED

            mini = Math.min(mini, prices[i]);  // FIXED
        }

        return profit;
    }
}