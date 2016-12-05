package solutions;

/**
 * 125. Valid Palindrome
 *
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 *
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 *
 * Note:
 * Have you consider that the string might be empty? This is a good question to
 * ask during an interview.
 *
 * For the purpose of this problem, we define empty string as valid palindrome.
 */

public class Solution125 {
    public boolean isPalindrome(String s) {
        for  (int i = 0, j = s.length() - 1; i <= j;) {
            if (!Character.isLetterOrDigit(s.charAt(i))) i++;
            else if (!Character.isLetterOrDigit(s.charAt(j))) j--;
            else {
                char x = Character.toLowerCase(s.charAt(i));
                char y = Character.toLowerCase(s.charAt(j));
                if (x != y) return false;
                i++;
                j--;
            }
        }
        return true;
    }
}
