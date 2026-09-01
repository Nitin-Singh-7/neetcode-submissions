class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int finalProfit = 0;

        while(right < prices.length){
            if(prices[left] > prices[right]){
                left = right;
            }
            int currentProfit = prices[right] - prices[left];
            if(currentProfit > finalProfit){
                finalProfit = currentProfit;
            }
            right++;
        }
        return finalProfit;
    
    }
}
