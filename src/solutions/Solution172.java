package solutions;

/**
 * 172. Factorial Trailing Zeroes
 *
 * Given an integer n, return the number of trailing zeroes in n!.
 * Note: Your solution should be in logarithmic time complexity.
 */

public class Solution172 {
    public int trailingZeroes(int n) {
        int answer = 0;
        while (n >= 5) {
            n /= 5;
            answer += n;
        }
        return answer;
    }
}
