class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int currentProfit = 0;
        int finalProfit = 0;
        int right = 1;
        int size = prices.length;

        while(right < size){
            if(prices[left] > prices[right]){
                left = right;
            }

            currentProfit = prices[right]-prices[left];
            if(currentProfit > finalProfit){
                finalProfit = currentProfit;
            }
            right++;
        }
        return finalProfit;
    }
}
