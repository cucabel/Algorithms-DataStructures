package dynamicProgramming;

public class _GBestTimeToBuyAndSellStock {
	
	public static int maxProfit(int[] prices) {
		
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			minPrice = Math.min(minPrice, prices[i]);  
			maxProfit = Math.max(maxProfit, prices[i] - minPrice);
		}
		return maxProfit;													
																			
	}																		
																			
	public static void main(String[] args) {
		
		int[] prices = {7, 1, 5, 3, 6, 4};
		System.out.println(maxProfit(prices));

	}

}

/*
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * 
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to 
 * find the maximum profit.
 * 
 * Example 1: 
 * Input: [7, 1, 5, 3, 6, 4] 
 * Output: 5
 * 
 * Example 2: 
 * Input: [7, 6, 4, 3, 1] 
 * Output: 0
 * In this case, no transaction is done, i.e. max profit = 0.
 * 
 */
