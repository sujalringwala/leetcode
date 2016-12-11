package solutions;

/**
 * 14. Longest Common Prefix
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 */

public class Solution014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++)
            minLength = Math.min(minLength, strs[i].length());

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < minLength; j++) {
            char c = strs[0].charAt(j);
            for (int i = 1; i < strs.length; i++)
                if (strs[i].charAt(j) != c) return sb.toString();
            sb.append(c);
        }
        return sb.toString();
    }
}
