package solutions;

/**
 * 9. Palindrome Number
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Solution009 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int rev = 0;
        for (;x > rev; x /= 10) rev = rev * 10 + x % 10;
        return (x == rev || x == rev / 10);
    }
}