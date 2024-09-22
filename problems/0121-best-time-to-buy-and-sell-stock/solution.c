int maxProfit(int* prices, int pricesSize) {
    if (pricesSize == 0) return 0;  // No prices available

    int min_price = prices[0];      // Start with the first price
    int max_profit = 0;             // Initial maximum profit is 0

    for (int i = 1; i < pricesSize; i++) {
        if (prices[i] < min_price) {
            min_price = prices[i];  // Update the minimum price
        }

        int profit = prices[i] - min_price;  // Calculate the profit from the current price
        if (profit > max_profit) {
            max_profit = profit;  // Update the maximum profit if we found a better one
        }
    }

    return max_profit;
}

