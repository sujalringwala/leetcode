package solutions;

/**
 * 415. Add Strings
 *
 * Given two non-negative numbers num1 and num2 represented as string, return
 * the sum of num1 and num2.
 *
 * Note:
 *
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to
 * integer directly.
 */

public class Solution415 {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        int sum, n1, n2;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 && j >= 0) {
            n1 = num1.charAt(i) - '0';
            n2 = num2.charAt(j) - '0';
            sum = n1 + n2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            i--;
            j--;
        }
        while (i >= 0) {
            sum = num1.charAt(i) - '0' + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            i--;
        }
        while (j >= 0) {
            sum = num2.charAt(j) - '0' + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            j--;
        }
        if (carry == 1) sb.append(1);
        sb.reverse();
        return sb.toString();
    }
}
