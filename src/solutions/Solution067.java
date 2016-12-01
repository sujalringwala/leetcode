package solutions;

/**
 * 67. Add Binary
 *
 * Given two binary strings, return their sum (also a binary string).
 *
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 */

public class Solution067 {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        StringBuilder sb = new StringBuilder();
        int x, y, sum;
        while (i >= 0 && j >= 0) {
            x = a.charAt(i) == '1' ? 1: 0;
            y = b.charAt(j) == '1' ? 1: 0;
            sum = x + y + carry;
            carry = sum / 2;
            sb.append(sum % 2);
            i--;
            j--;
        }
        while (i >= 0) {
            x = a.charAt(i) == '1' ? 1: 0;
            sum = x + carry;
            carry = sum / 2;
            sb.append(sum % 2);
            i--;
        }
        while (j >= 0) {
            y = b.charAt(j) == '1' ? 1: 0;
            sum = y + carry;
            carry = sum / 2;
            sb.append(sum % 2);
            j--;
        }
        if (carry == 1) sb.append(1);
        sb.reverse();
        return sb.toString();
    }
}