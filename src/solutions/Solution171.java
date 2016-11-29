package solutions;

/**
 * 171. Excel Sheet Column Number
 *
 * Given a column title as appear in an Excel sheet, return its corresponding
 * column number.
 *
 * For example:
 *      A -> 1
 *      B -> 2
 *      C -> 3
 *      ...
 *      Z -> 26
 *      AA -> 27
 *      AB -> 28
 */

public class Solution171 {
    public int titleToNumber(String s) {
        int multiplier = 1;
        int number = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            number += ((int)s.charAt(i) - 'A' + 1) * multiplier;
            multiplier *= 26;
        }
        return number;
    }
}
