class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0; 
        }
        
        int min = 0;
        int max = 0;
        int profit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[min]) {
                min = i;
            } else if (prices[i] - prices[min] > profit) {
                max = i;
                profit = prices[max] - prices[min];
            }
        }
        
        return profit;
    }
}
