class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int i=0, j=1;

        while (j < prices.length){
            if (prices[j] > prices[i]){
                int curr_profit = prices[j]-prices[i];
                max_profit = Math.max(curr_profit, max_profit);
            } else {
                i = j;
            }
            j += 1;
        
            
            
        }
        return max_profit;
        
    }
}
