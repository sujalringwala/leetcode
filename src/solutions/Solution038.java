package solutions;

/**
 * 38. Count and Say
 *
 * The count-and-say sequence is the sequence of integers beginning as follows:
 *
 * 1, 11, 21, 1211, 111221, ...
 *
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 *
 * Note: The sequence of integers will be represented as a string.
 */

public class Solution038 {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        else return helper(countAndSay(n - 1));
    }

    public String helper(String number) {
        StringBuilder sb = new StringBuilder();
        char last = number.charAt(0);
        int count = 1;
        for (int i = 1; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c == last) count++;
            else {
                sb.append(count);
                sb.append(last);
                last = c;
                count = 1;
            }
        }
        if (count > 0) {
            sb.append(count);
            sb.append(last);
        }
        return sb.toString();
    }
}