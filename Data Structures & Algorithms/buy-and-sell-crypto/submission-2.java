class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; // Buy pointer (min price so far)
        int right = 1; // Sell pointer
        int finalProfit = 0;

        while (right < prices.length) {
            // Found a lower buying price, shift left pointer here
            if (prices[left] > prices[right]) {
                left = right;
            } else {
                // Profitable trade found, check if it's the maximum profit
                int currentProfit = prices[right] - prices[left];
                if (currentProfit > finalProfit) {
                    finalProfit = currentProfit;
                }
            }
            right++; // Single increment per loop iteration
        }
        return finalProfit;
    }
}