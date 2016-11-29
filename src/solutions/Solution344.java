package solutions;

/**
 * 344. Reverse String
 *
 * Write a function that takes a string as input and returns the string
 * reversed.
 *
 * Example:
 * Given s = "hello", return "olleh".
 */

public class Solution344 {
    public String reverseString(String s) {
        if (s == null || s.length() == 0) return "";

        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;
        char temp;

        while (i < j) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}