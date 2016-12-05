package solutions;

/**
 * 28. Implement strStr()
 *
 * Implement strStr().
 *
 * Returns the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 */

public class Solution028 {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            boolean found = true;
            for (int j = i, k = 0; k < needle.length(); j++, k++) {
                if (haystack.charAt(j) != needle.charAt(k)) {
                    found = false; break;
                }
            }
            if (found) return i;
        }
        return -1;
    }
}
