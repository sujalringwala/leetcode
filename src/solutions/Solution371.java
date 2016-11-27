package solutions;

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
