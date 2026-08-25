class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                // Update the minimum price encountered so far
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                // Update max profit if selling today yields a higher return
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}