package solutions;

/**
 * 246. Strobogrammatic Number
 *
 * A strobogrammatic number is a number that looks the same when rotated 180
 * degrees (looked at upside down).
 *
 * Write a function to determine if a number is strobogrammatic. The number
 * is represented as a string.
 *
 * For example, the numbers "69", "88", and "818" are all strobogrammatic.
 */

public class Solution246 {
    public boolean isStrobogrammatic(String num) {
        for (int i = 0, j = num.length() - 1; i <= j; i++, j--) {
            if (!((num.charAt(i) == '6' && num.charAt(j) == '9')
                    || (num.charAt(i) == '9' && num.charAt(j) == '6')
                    || (num.charAt(i) == '8' && num.charAt(j) == '8')
                    || (num.charAt(i) == '1' && num.charAt(j) == '1')
                    || (num.charAt(i) == '0' && num.charAt(j) == '0')))
                return false;
        }
        return true;
    }
}
