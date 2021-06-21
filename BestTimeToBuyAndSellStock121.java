
public class BestTimeToBuyAndSellStock121 {
	public int maxProfit(int[] prices) {
		if (prices.length <= 1)
			return 0;
		int min_input = prices[0];
		int max_profit = 0;
		for (int i=1;i<prices.length;i++) {
			min_input = Math.min(min_input, prices[i]);
			max_profit = Math.max(max_profit, prices[i] - min_input);
		}
		return max_profit;
    }
}
