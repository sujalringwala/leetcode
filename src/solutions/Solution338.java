package solutions;

/**
 * 338. Counting Bits
 *
 * Given a non negative integer number num. For every numbers i in the range
 * 0 ≤ i ≤ num calculate the number of 1's in their binary representation and
 * return them as an array.
 *
 * Example:
 * For num = 5 you should return [0,1,1,2,1,2].
 *
 * Solution:
 * Recurrence is f[i] = f[i / 2] + i % 2
 */

public class Solution338 {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 1; i <= num; i++)
            result[i] = result[i >> 1] + (i & 1);
        return result;
    }
}