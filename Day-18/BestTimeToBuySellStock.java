class BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {

            // update minimum price
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // calculate profit
            int profit = prices[i] - minPrice;

            // update maximum profit
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};

        System.out.println(maxProfit(prices1)); // 5
        System.out.println(maxProfit(prices2)); // 0
    }
}
