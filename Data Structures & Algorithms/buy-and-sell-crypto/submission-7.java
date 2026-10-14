class Solution {
    public int maxProfit(int[] prices) {
        int current = 0;
        int max = 0;
        int left = 0;
        int right = 1;

        while(right < prices.length){
            if(prices[left] > prices[right]){
                left = right;
                right = left+1;
                continue;
            }
            current = prices[right] - prices[left];
            if(current > max){
                max = current;
            }
            right++;
        }

        return max;
    }
}
