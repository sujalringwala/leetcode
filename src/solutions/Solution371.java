package solutions;

/**
 * 371. Sum of Two Integers
 *
 * Calculate the sum of two integers a and b, but you are not allowed to use
 * the operator + and -.
 *
 * Example:
 * Given a = 1 and b = 2, return 3.
 */

public class Solution371 {
    public int getSum(int a, int b) {
        int carry;
        while (b != 0) {
            carry = a & b;
            a ^= b;
            b = carry << 1;
        }
        return a;
    }
}