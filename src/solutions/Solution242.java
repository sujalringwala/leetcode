package solutions;


/**
 * 242. Valid Anagram
 *
 * Given two strings s and t, write a function to determine if t is an anagram
 * of s.
 *
 * For example:
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 *
 * Note:
 * You may assume the string contains only lowercase alphabets.
 *
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your
 * solution to such case?
 *
 */

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++)
            counts[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++)
            counts[t.charAt(i) - 'a']--;
        for (int i = 0; i < counts.length; i++)
            if (counts[i] != 0) return false;
        return true;
    }
}