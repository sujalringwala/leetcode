package solutions;

import java.util.HashMap;

/**
 * 3. Longest Substring Without Repeating Characters
 *
 * Given a string, find the length of the longest substring without repeating
 * characters.
 *
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the
 * answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class Solution003 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;

        HashMap<Character, Integer> seen = new HashMap<>();
        int max = 0, start = 0, end = 0;

        for (int index = 0; index < s.length(); index++) {
            Character curr = s.charAt(index);
            if (seen.containsKey(curr)) {
                max = Math.max(end - start + 1, max);
                int last = seen.get(curr);
                if (last + 1 > start)
                    start = seen.get(curr) + 1;
                end = index;
                seen.put(curr, index);
            } else {
                seen.put(curr, index);
                end = index;
            }
        }
        return Math.max(end - start + 1, max);
    }
}
