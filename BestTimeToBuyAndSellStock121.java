
public class BestTimeToBuyAndSellStock121 {
	public static int maxProfit(int[] prices) {
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
	public static void main(String[] arg) {
		int[] prices = new int[6];
		prices[0] = 7;
		prices[1] = 1;
		prices[2] = 5;
		prices[3] = 3;
		prices[4] = 6;
		prices[5] = 4;
		int profit = maxProfit(prices);
		System.out.println(profit);
	}
}
