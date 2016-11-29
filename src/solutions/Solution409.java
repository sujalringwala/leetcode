package solutions;

/**
 * 409. Longest Palindrome
 *
 * Given a string which consists of lowercase or uppercase letters, find the
 * length of the longest palindromes that can be built with those letters.
 *
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 *
 * Note:
 * Assume the length of given string will not exceed 1,010.
 *
 * Example:
 *
 * Input: "abccccdd"
 * Output: 7
 *
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 */

public class Solution409 {
    public int longestPalindrome(String s) {
        int[] map = new int[128];
        int result = 0, plus = 0;

        for (char c: s.toCharArray()) {
            map[c]++;
        }
        for (int i = 0; i < 128; i++) {
            if (map[i] % 2 == 0) {
                result += map[i];
            } else {
                result += map[i] - 1;
                plus = 1;
            }
        }
        return result + plus;
    }
}
