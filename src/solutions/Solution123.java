package solutions;

/**
 * 123. Best Time to Buy and Sell Stock III
 *
 * Say you have an array for which the ith element is the price of a given
 * stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete at most
 * two transactions.
 *
 * Note:
 * You may not engage in multiple transactions at the same time (ie, you must
 * sell the stock before you buy again).
 */

public class Solution123 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;

        int b1 = Integer.MIN_VALUE;
        int b2 = Integer.MIN_VALUE;
        int s1 = 0, s2 = 0;

        for (int p: prices) {
            b1 = Math.max(b1, -p);
            s1 = Math.max(s1, b1 + p);
            b2 = Math.max(b2, s1 - p);
            s2 = Math.max(s2, b2 + p);
        }
        return s2;
    }
}