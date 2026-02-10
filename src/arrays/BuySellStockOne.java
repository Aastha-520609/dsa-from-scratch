package arrays;

public class BuySellStockOne {
	
	//only update buy price if new price is lower
	//try to sell if new price > buy price
	//current profit = today's price - buy price
	//update max profit , if current profit > max profit
	
	public static int maxProfit(int[] prices) {
		
		// buyPrice keeps track of the minimum price seen so far (best day to buy)
        int buyPrice = prices[0];
        
        // currentProfit represents profit if we sell on the current day
        int currentProfit = 0;
        
        // maxProfit stores the maximum profit achieved so far
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){
        	
        	 /*
             * If we find a lower price, we update buyPrice.
             * This is similar to Kadane's reset step where we drop
             * a negative contribution and start fresh.
             */
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            /*
             * Otherwise, calculate profit by selling on the current day
             * and update maxProfit if this profit is better than before.
             */
            else{
                currentProfit = prices[i] - buyPrice;
                maxProfit = Math.max(currentProfit, maxProfit);
            }

        }
        return maxProfit;
    }
	
	public static void main(String args[]) {
		
		// Case 1: Normal case (profit possible)
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit (Case 1): " + maxProfit(prices1));
        // Expected Output: 5 (Buy at 1, Sell at 6)

        // Case 2: Prices always decreasing (no profit possible)
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit (Case 2): " + maxProfit(prices2));
        // Expected Output: 0 (No transaction)

        // Case 3: Prices always increasing (buy first, sell last)
        int[] prices3 = {1, 2, 3, 4, 5};
        System.out.println("Max Profit (Case 3): " + maxProfit(prices3));
        // Expected Output: 4 (Buy at 1, Sell at 5)
		
	}

}
