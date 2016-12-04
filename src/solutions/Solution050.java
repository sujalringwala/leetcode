package solutions;

/**
 * 50. Pow(x, n)
 *
 * Implement pow(x, n).
 */

public class Solution050 {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n < 0) return 1 / x * myPow(1 / x, -(n + 1));

        double y = myPow(x, n/2);
        return (n % 2 == 0) ? y * y : (y * y * x);
    }
}
