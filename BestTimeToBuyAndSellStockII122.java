
public class BestTimeToBuyAndSellStockII122 {
	public int maxProfit(int[] prices) {
		// 执行用时：2 ms, 在所有 Java 提交中击败了36.24%的用户
		// 内存消耗：38.3 MB, 在所有 Java 提交中击败了46.77%的用户
		int len = prices.length;
		if (len <= 1) 
			return 0;
		int hold = -prices[0];
		int nohold = 0;
		for (int i=1; i<len; i++) {
			hold = Math.max(hold, nohold - prices[i]);
			nohold = Math.max(nohold, hold + prices[i]);
		}
		return nohold;
	}
	public int maxProfit1(int[] prices) {
		// 执行用时：1 ms, 在所有 Java 提交中击败了99.62%的用户
		// 内存消耗：38.1 MB, 在所有 Java 提交中击败了82.37%的用户
		int len = prices.length;
		if (len <= 1)
			return 0;
		int profit = 0;
		for (int i=0; i<len-1; i++)
			profit += Math.max(prices[i+1] - prices[i], 0);
		return profit;
	}
}
