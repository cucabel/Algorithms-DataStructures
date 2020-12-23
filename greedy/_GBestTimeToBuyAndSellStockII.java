package greedy;

public class _GBestTimeToBuyAndSellStockII {

	public static int maxProfit(int[] prices) {

		int total = 0;

		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i + 1] > prices[i]) {
				total += prices[i + 1] - prices[i]; 
			}
		}
		return total;
	}

	public static void main(String[] args) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));
	}
}

/*
 * Say you have an array for which the ith element is the price of a
 * given stock on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete as many
 * transactions as you like (ie, buy one and sell one share of the stock
 * multiple times). However, you may not engage in multiple transactions at the
 * same time (ie, you must sell the stock before you buy again).
 * 
 */
