package solutions;

/**
 * 7. Reverse Integer
 *
 * Reverse digits of an integer.
 *
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */

public class Solution007 {
    public int reverse(int x) {
        int result = 0, tail, temp;
        for (; x != 0; x /= 10) {
            tail = x % 10;
            temp = result * 10 + tail;
            if ((temp - tail) / 10 != result) return 0;
            result = temp;
        }
        return result;
    }
}