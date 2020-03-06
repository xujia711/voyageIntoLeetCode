class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyPrice = -1;
        int sellPrice = -1;

        for (int price : prices) {
            if (sellPrice > price) {
                profit += sellPrice - buyPrice;
                buyPrice = -1;
                sellPrice = -1;
            }

            if (buyPrice < 0 || buyPrice > price) {
                buyPrice = price;
            }

            if (buyPrice < price && sellPrice < price ) {
                sellPrice = price;
            }
        }

        if (buyPrice >= 0 && sellPrice > buyPrice) {
            profit += sellPrice - buyPrice;
        }

        return profit;
    }
}