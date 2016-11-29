package solutions;

/**
 * 168. Excel Sheet Column Title
 *
 * Given a positive integer, return its corresponding column title as it
 * would appear in an Excel sheet.
 *
 * For example:
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 */

public class Solution168 {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append((char)('A' + (--n % 26)));
            n /= 26;
        }
        sb.reverse();
        return sb.toString();
    }
}
